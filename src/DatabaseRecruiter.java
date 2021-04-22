import java.util.ArrayList;

/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version(Modul2-25.03.2021)
 */
public class DatabaseRecruiter /** inisiasi class */
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();;
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase(){
            return RECRUITER_DATABASE;
        }

    public static int getLastId(){
        return getLastId();
    }

    public static Recruiter getRecruiterById(int id){
        for (int i = 0; i < RECRUITER_DATABASE.size(); i++) {
            if (RECRUITER_DATABASE.get(i).getId() == id) {
                return RECRUITER_DATABASE.get(i);
            }
        }
        return null;
    }

    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = RECRUITER_DATABASE.size()-1;
        return true;
    }

    public static boolean removeRecruiter(int id){
        for (int i = 0; i < RECRUITER_DATABASE.size(); i++) {
            if (RECRUITER_DATABASE.get(i).getId() == id) {
                RECRUITER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}