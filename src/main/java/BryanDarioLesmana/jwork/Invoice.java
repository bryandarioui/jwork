package BryanDarioLesmana.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;

/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

/** inisiasi class */
public abstract class Invoice /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;

    /**
     * constructor
     * @param id id pada invoice
     * @param jobs job pada invoice
     * @param jobseeker jobseeker pada invoice
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        this.id = id;
        this.jobs = jobs;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = InvoiceStatus.Ongoing;
        this.date = Calendar.getInstance();
        LocalDate localDate = LocalDate.now();
        setDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
    }
    /**
     * getter id dari invoice
     * @return id dari invoice
     */
    public int getId(){
        return this.id;
    }
    /**
     * getter id job dari invoice
     * @return id job dari invoice
     */
    public ArrayList<Job> getJobs(){
        return this.jobs;
    }
    /**
     * getter tanggal dari invoice
     * @return tanggal dari invoice
     */
    public Calendar getDate(){
        return this.date;
    }
    /**
     * getter jumlah gaji dari invoice
     * @return jumlah gaji dari invoice
     */
    public int getTotalFee(){
        return this.totalFee;
    }
    /**
     * getter objek jobseeker dari invoice
     * @return objek jobseeker dari invoice
     */
    public Jobseeker getJobseeker(){
        return this.jobseeker;
    }
    /**
     * getter objek payment type dari invoice
     * @return objek payment type dari invoice
     */
    public abstract PaymentType getPaymentType();

    public InvoiceStatus getInvoiceStatus(){
        return this.invoiceStatus;
    }
    /**
     * setter id dari invoice
     * @param id dari invoice
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * setter id job dari invoice
     * @param jobs dari invoice
     */

    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs;
    }

    public void setDate(Calendar Date){
        this.date = date;
    }
    public void setDate(int year,int month,int dayOfMonth ){
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    /**
     * setter jumlah gaji dari invoice
     */
    public abstract void setTotalFee();
    /**
     * setter objek jobseeker dari invoice
     * @param jobseeker jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    /**
     * setter objek jobseeker dari invoice
     * @param paymentType paymenttype
     */
    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }

    public abstract String toString();
    //public abstract void printData();
    /*{
        System.out.println("================== INVOICE ==================");
        System.out.println("ID :" + id);
        System.out.println("ID Job :" + job);
        System.out.println("Date :" + date);
        System.out.println("Seeker :" + jobseeker.getName());
        System.out.println("Fee :" + totalFee);
        System.out.println("Status :" + invoiceStatus);
    }*/
}