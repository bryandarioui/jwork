/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version(Modul2-25.03.2021)
 */
public class Jwork{ /** inisiasi class */
    
    public static void main (String[] args){ /** main method */
        /** 
         * membuat objek dari class location, recruiter, job, jobseeker, dan invoice
         */
        Location location1 = new Location("DKI Jakarta","Jakarta Pusat","Tempat lahir");
        Recruiter recruiter1 = new Recruiter(1,"Bryan","bryandariolc@gmail.com","081398558008",location1);
        Job job1 = new Job(1,"Programmer",recruiter1,200000,JobCategory.DataAnalyst); /** menggunakan enum pada Jobcategory sesuai dengan enum yang ada*/
        Jobseeker jobseeker1 = new Jobseeker(1,"Apeng","erickrichardo@gmail.com","password123","1 Januari 2020");
        Bonus bonus1 = new Bonus(1, null, 50000, 25000, true);
        Bonus bonus2 = new Bonus(2, "test", 10000, 30000, true);
        Bonus bonus3 = new Bonus(3, "test", 60000, 30000, true);
        EwalletPayment ewalletpayment1 = new EwalletPayment(1, job1, "14 Desember 2020", jobseeker1, InvoiceStatus.Ongoing,bonus1);
        EwalletPayment ewalletpayment2 = new EwalletPayment(2, job1, "14 Desember 2020", jobseeker1, InvoiceStatus.Ongoing,bonus2);
        EwalletPayment ewalletpayment3 = new EwalletPayment(3, job1, "14 Desember 2020", jobseeker1, InvoiceStatus.Ongoing,bonus3);
        
        
        ewalletpayment1.setTotalFee();
        ewalletpayment2.setTotalFee();
        ewalletpayment3.setTotalFee(); 
        
        ewalletpayment1.printData();
        ewalletpayment2.printData();
        ewalletpayment3.printData();
        //Invoice invoice1 = new Invoice(1,job1.getId(),"1/20/2021",job1.getFee(),jobseeker1,PaymentType.BankPayment,InvoiceStatus.Ongoing);
       
        
        //System.out.println("Nama Recruiter " + recruiter1.getName()); /** fungsi mencetak nama recruiter dengan aksesor get */
        //recruiter1.setName("Ferlinda"); /** mengubah nama recruiter dengan mutator set */
        //System.out.println("Nama Recruiter " + recruiter1.getName()); /** fungsi mencetak kembali nama recruiter dengan aksesor get */
        
        //job1.printData(); /** Cetak nama job dengan memanggil method print data*/
        //System.out.println(PaymentType.Bank);
        
        //invoice1.printData(); /** Cetak nama job dengan memanggil method print data*/
        //System.out.println(PaymentType.Bank);
        
        //DatabaseJob.addJob(job1); /** memasukkan objek kelas job dan recruiter tanpa membuat databasenya*/
        //DatabaseRecruiter.addRecruiter(recruiter1);
    }   
}
