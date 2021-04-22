import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee = 0;

    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
    super(id, job, jobseeker, invoiceStatus);
    }
    
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee){
    super(id, job, jobseeker, invoiceStatus);
    this.adminFee = adminFee;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE; 
    }
    public int getAdminFee(){
        return adminFee;
    }
    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;
    }
    public void setTotalFee(){
        if(adminFee != 0){
           super.totalFee = super.getJob().getFee() - adminFee;
    }else{
        super.totalFee = super.getJob().getFee();
    }
    }
 
    @Override
    public String toString(){
    String strdate = "";
    String pattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Date date = getDate().getTime();
    if(date != null){
       strdate = simpleDateFormat.format(date);
    }
        return "\n==========Invoice==========" +
                "\nID: "+ super.getId() +
                "\nJob: "+ super.getJob().getName() +
                "\nDate: "+ strdate +
                "\nJob Seeker: "+ super.getJobseeker().getName() +
                "\nAdminFee "+ adminFee +
                "\nTotal Fee: "+ super.totalFee +
                "\nStatus:  "+ super.getInvoiceStatus().toString() +
                "\nPayment Type: "+ PAYMENT_TYPE.toString();
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

