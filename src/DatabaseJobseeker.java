import java.util.ArrayList;

public class DatabaseJobseeker
{
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();;
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getJobseekerDatabase(){
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id){
        for (int i=0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getId() == id){
                return JOBSEEKER_DATABASE.get(i);
            }
        }
        return null;
    }

    public static boolean addJobseeker(Jobseeker jobseeker){
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }

    public static boolean removeJobseeker(int id){
        for (int i=0; i < JOBSEEKER_DATABASE.size(); i++) {
            if(JOBSEEKER_DATABASE.get(i).getId() == id) {
                JOBSEEKER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}