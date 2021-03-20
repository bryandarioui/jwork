public class Jwork{
    
    public static void main (String[] args){
        Location location1 = new Location("DKI Jakarta","Jakarta Pusat","Tempat lahir");
        Recruiter recruiter1 = new Recruiter(1,"Bryan","bryandariolc@gmail.com","081398558008",location1);
        Job job1 = new Job(1,"Programmer",recruiter1,2,"IT");
        Jobseeker jobseeker1 = new Jobseeker(1,"Apeng","erickrichardo@gmail.com","password123","1 Januari 2020");
        Invoice invoice1 = new Invoice(1,2,"1 Desember 2020",100000,jobseeker1);
        
        System.out.println("Nama Recruiter " + recruiter1.getName());
        recruiter1.setName("Ferlinda");
        System.out.println("Nama Recruiter " + recruiter1.getName());
        
        job1.printData();
        
        DatabaseJob.addJob(job1);
        DatabaseRecruiter.addRecruiter(recruiter1);
    }   
}
