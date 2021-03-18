public class Jwork{
    
    public static void main (String[] args){
        Location location1 = new Location("","","");
        Recruiter recruiter1 = new Recruiter(1,"as","asd","ds",location1);
        Job job1 = new Job(1,"",recruiter1,2,"");
        Jobseeker jobseeker1 = new Jobseeker(1,"","","","");
        Invoice invoice1 = new Invoice(1,2,"",3,jobseeker1);
        
        location1.setProvince("Jakarta");
        recruiter1.setName("Dario");
        job1.setFee(100000);
        jobseeker1.setName("Aldo");
        invoice1.setTotalFee(500000);
        
        location1.printData();
        recruiter1.printData();
        jobseeker1.printData();
    }   
}
