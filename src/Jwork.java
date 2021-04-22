/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version(Modul2-25.03.2021)
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Jwork{ /** inisiasi class */
    
    public static void main (String[] args){ /** main method */
        /** 
         * membuat objek dari class location, recruiter, job, jobseeker, dan invoice
         */
        Location location1 = new Location("DKI Jakarta","Jakarta Pusat","Tempat lahir");
        DatabaseRecruiter.addRecruiter( new Recruiter(1,"Bryan","bryan@gmail.com","081398558008",location1));

        DatabaseJobseeker.addJobseeker( new Jobseeker(1,"Dario","bryandariolc@gmail.com","asdas"));
        DatabaseJobseeker.addJobseeker( new Jobseeker(2,"Dario","bryandariolc@gmail.com","asdas"));
        DatabaseJobseeker.addJobseeker( new Jobseeker(3,"Ferlinda","ferlinda@gmail.com","asdas"));

        DatabaseJob.addJob( new Job(1,"Senior Designer",DatabaseRecruiter.getRecruiterById(1),200000,JobCategory.DataAnalyst));
        DatabaseJob.addJob( new Job(2,"Senior Designer",DatabaseRecruiter.getRecruiterById(2),200000,JobCategory.DataAnalyst));
        DatabaseJob.addJob( new Job(3,"Senior Designer",DatabaseRecruiter.getRecruiterById(3),200000,JobCategory.WebDeveloper));

        {
            ArrayList<Jobseeker> jstest = DatabaseJobseeker.getJobseekerDatabase();
            for (Jobseeker js : jstest)
                System.out.println(js.toString());
        }

        Job job1 = new Job(1, "Duelist", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
        Job job2 = new Job(2, "Controller", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.BackEnd);
        Job job3 = new Job(3, "tes3", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UI);
        DatabaseJob.addJob(job1);
        DatabaseJob.addJob(job2);
        DatabaseJob.addJob(job3);

        ArrayList<Job> jobtest = DatabaseJob.getJobByCategory(JobCategory.UI);
        for (Job j: jobtest)
            System.out.println(j.toString());
    }
        //Recruiter recruiter1 = new Recruiter(1,"Bryan","bryandariolc@gmail.com","081398558008",location1);
        //Job job1 = new Job(1,"Senior Designer",recruiter1,200000,JobCategory.DataAnalyst);
        
        //Jobseeker jobseeker1 = new Jobseeker(1,"Apeng","bryandariolc@gmail.com","asdas",new GregorianCalendar(2021, 3, 12));
        /*Jobseeker jobseeker2 = new Jobseeker(2,"Ando","ando@gmail.com","Asdasd123",2021, 12, 12);
        Jobseeker jobseeker3 = new Jobseeker(3,"Wilson","wilson@gmail.com","password123");
        
        jobseeker1.toString();
        System.out.println(jobseeker1.toString());
        jobseeker2.toString();
        System.out.println(jobseeker2.toString());
        jobseeker3.toString();
        System.out.println(jobseeker3.toString());
        
        jobseeker1.setEmail("erickrichardo@gmail.com");
        jobseeker1.setPassword("AsdAsd123");
        jobseeker1.toString();
        System.out.println(jobseeker1.toString());        
        */
        
        //Calendar calendar1 = new GregorianCalendar();
        
       // BankPayment bankpayment1 = new BankPayment(1, job1, jobseeker1, InvoiceStatus.Finished);
        //bankpayment1.setDate(calendar1);
        //BankPayment bankpayment2 = new BankPayment(2, job1, jobseeker1, InvoiceStatus.Finished, 100000);
        //Bonus bonus1 = new Bonus(1, null, 50000, 25000, true);
        //Bonus bonus2 = new Bonus(2, "test", 10000, 30000, true);
        //Bonus bonus3 = new Bonus(3, "test", 60000, 30000, true);
        //EwalletPayment ewalletpayment1 = new EwalletPayment(1, job1, jobseeker1, InvoiceStatus.Ongoing,bonus1);
        //ewalletpayment1.setDate(calendar1);//EwalletPayment ewalletpayment2 = new EwalletPayment(2, job1, jobseeker1, InvoiceStatus.Ongoing,bonus2);
        //EwalletPayment ewalletpayment3 = new EwalletPayment(3, job1, jobseeker1, InvoiceStatus.Ongoing,bonus3);
        //bankpayment1.setTotalFee();
        //bankpayment2.setTotalFee();
        
       // bankpayment1.toString();
        //System.out.println(bankpayment1.toString());
        //bankpayment2.printData();        


        //ewalletpayment1.setTotalFee();
        //ewalletpayment2.setTotalFee();
        //ewalletpayment3.setTotalFee(); 
        
        //ewalletpayment1.toString();
        //System.out.println(ewalletpayment1.toString());
        //ewalletpayment2.printData();
        //ewalletpayment3.printData();
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

