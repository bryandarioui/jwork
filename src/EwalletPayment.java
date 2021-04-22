import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class EwalletPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
    
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
    super(id, jobs, jobseeker);
    }
    
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker, Bonus bonus){
    super(id, jobs, jobseeker);
    this.bonus = bonus;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE; 
    }
    public Bonus getBonus(){
        return bonus;
    }
    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }
    public void setTotalFee() {
        //super.totalFee = getJob().getFee();
        if (bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            super.totalFee += bonus.getExtraFee();
        }
    }
    
    @Override
    public String toString() {
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(date);
        }
        // Print data secara keseluruhan
        String str = "====== Ewallet Payment ======" +
                "\nID           : " + getId() +
                "\nJobs         : " + getJobs() +
                "\nDate         : " + strDate +
                "\nSeeker       : " + getJobseeker().getName();
        // Hanya tampilkan referral code kalau bonusnya aktif atau valid
        if (bonus.getReferralCode() != null &&
                bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            str += "\nReferral Code: " + bonus.getReferralCode();
        }
        str += "\nFee          : " + totalFee +
                "\nStatus       : " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }
}

    /*public void printData()
    {
        System.out.println("==========Invoice==========");
        System.out.println("ID: "+ super.getId());
        System.out.println("Job: "+ super.getJob().getName());
        System.out.println("Date: "+ super.getDate());
        System.out.println("Job Seeker: "+ super.getJobseeker().getName());
        System.out.println("Total Fee: "+ super.totalFee);

        if (getJob().getFee() != totalFee) {
            System.out.println("Bonus "+ bonus.getReferralCode());
        }

        System.out.println("Status:  "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type: "+ PAYMENT_TYPE.toString());
    */
