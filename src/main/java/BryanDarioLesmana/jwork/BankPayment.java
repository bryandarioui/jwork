/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/** inisiasi class */
public class BankPayment extends Invoice {
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee = 0;

    /**
     * constructor bank payment
     * @param id id
     * @param jobs jobs
     * @param jobseeker jobseeker
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker) {
        super(id, jobs, jobseeker);
    }

    /**
     * constructor bank payment dengan admin fee
     * @param id id
     * @param job job
     * @param jobseeker jobseeker
     * @param adminFee admin fee
     */
    public BankPayment(int id, ArrayList<Job> job, Jobseeker jobseeker, int adminFee) {
        super(id, job, jobseeker);
        this.adminFee = adminFee;
    }

    /**
     * method getter payment type
     * @return payment type
     */
    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }

    /**
     * method getter admin fee
     * @return admin fee
     */
    public int getAdminFee() {
        return adminFee;
    }

    /**
     * method setter admin fee
     * @param adminFee admin fee
     */
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }

    /** memperbarui total fee berdasarkan bonus */
    public void setTotalFee() {
        //totalFee = getJob().getFee();
        if (adminFee != 0) {
            totalFee -= adminFee;
        }
    }

    @Override
    /**
     * method string untuk menampilkan hasil
     * @return string
     */
    public String toString()
    {

        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            strDate = dateFormat.format(date);
        }
        String str =    "====== Ewallet Payment ======" +
                "\nID           : " + getId() +
                "\nJobs         : " + getJobs() +
                "\nDate         : " + strDate +
                "\nSeeker       : " + getJobseeker().getName() +
                "\nFee : " + totalFee +
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
        System.out.println("AdminFee "+ adminFee);
        System.out.println("Total Fee: "+ super.totalFee);
        System.out.println("Status:  "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type: "+ PAYMENT_TYPE.toString());
    }*/

