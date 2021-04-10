import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version(Modul2-25.03.2021)
 */
public abstract class Invoice /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private Job job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;
    
/**
 * constructor 
 * @param id id pada invoice
 * @param idJob id dari Job pada invoice
 * @param date tanggal dari invoice
 * @param totalFee jumlah total gaji
 * @param jobseeker objek jobseeker
 */
    public Invoice(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){ 
        this.id = id;
        this.job = job;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
        
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
    public Job getJob(){
        return this.job;
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
 * @param id job dari invoice 
 */

    public void setJob(int Job){ 
        this.job = job;
    }
/**
 * setter tanggal dari invoice 
 * @param tanggal dari invoice 
 */
    public void setDate(Calendar Date){
        this.date = date;
    }
    public void setDate(int year,int month,int dayOfMonth ){
         this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
/**
 * setter jumlah gaji dari invoice 
 * @param jumlah gaji dari invoice 
 */
    public abstract void setTotalFee();
/**
 * setter objek jobseeker dari invoice 
 * @param objek jobseeker dari invoice 
 */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    
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