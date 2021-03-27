/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version(Modul2-25.03.2021)
 */
public class Invoice /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private int idJob;
    private String date;
    private int totalFee;
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
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus invoiceStatus){ 
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
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
    public int getIdJob(){
        return this.idJob;
    }
/**
 * getter tanggal dari invoice 
 * @return tanggal dari invoice 
 */
    public String getDate(){
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
    public Jobseeker getjobseeker(){
        return this.jobseeker;
    }

    public PaymentType getPaymentType(){
        return this.paymentType;
    }    
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

    public void setIdJob(int idJob){ 
        this.idJob = idJob;
    }
/**
 * setter tanggal dari invoice 
 * @param tanggal dari invoice 
 */
    public void setDate(String date){
        this.date = date;
    }
/**
 * setter jumlah gaji dari invoice 
 * @param jumlah gaji dari invoice 
 */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
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
/**
 * method untuk print total gaji dari invoice
 * outputnya adalah total gaji
 */
    public void printData(){
        System.out.println("================== INVOICE ==================");
        System.out.println("ID :" + getId());
        System.out.println("ID Job :" + getIdJob());
        System.out.println("Date :" + getDate());
        System.out.println("Seeker :" + jobseeker.getName());
        System.out.println("Fee :" + getTotalFee());
        System.out.println("Status :" + getInvoiceStatus());
    }
}