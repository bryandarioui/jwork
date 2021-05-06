import java.util.ArrayList;

/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version(Modul2-25.03.2021)
 */
public class DatabaseJob /** inisiasi class */
{
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();;
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return getLastId();
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job val = null;
        try {
            for (Job job : JOB_DATABASE) {
                if (id == job.getId()) {
                    val = job;
                }
            }
        }
        catch (Exception error)
        {
            throw new JobNotFoundException(id);
        }
        return val;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> a = new ArrayList<>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId) {
                a.add(JOB_DATABASE.get(i));
                return a;
            }
        }
        return null;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> a = new ArrayList<>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (JOB_DATABASE.get(i).getCategory() == category) {
                a.add(JOB_DATABASE.get(i));
                return a;
            }
        }
        return null;
    }

    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = JOB_DATABASE.size()-1;
        lastId = job.getId();
        return true;
    }

    public static boolean removeJob(int id) throws JobNotFoundException{
        for (Job job : JOB_DATABASE)
        {
            if (job.getId() == id)
            {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        throw new JobNotFoundException(id);
    }
}