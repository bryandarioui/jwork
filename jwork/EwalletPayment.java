public class EwalletPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
    super(id, job, date, 0, jobseeker, null, invoiceStatus);
    this.bonus = null;
    }
    
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus, Bonus bonus){
    super(id, job, date, 0, jobseeker, null, invoiceStatus);
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
    public void setTotalFee(){
        if(bonus != null && bonus.getActive() == true && getTotalFee() > bonus.getMinTotalFee()){
           super.totalFee = super.getJob().getFee() + bonus.getExtraFee();
    }else{
        super.totalFee = super.getJob().getFee();
    }
    }

    @Override
    public void printData()
    {
        System.out.println("==========Invoice==========");
        System.out.println("ID: "+ super.getId());
        System.out.println("Job: "+ super.getJob().getName());
        System.out.println("Date: "+ super.getDate());
        System.out.println("Job Seeker: "+ super.getJobseeker().getName());
        System.out.println("Total Fee: "+ super.totalFee);

        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee() && bonus.getReferralCode() != null) {
            System.out.println("Referral Code: "+ bonus.getReferralCode());
        }

        System.out.println("Status:  "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type: "+ PAYMENT_TYPE.toString());
    }
}
