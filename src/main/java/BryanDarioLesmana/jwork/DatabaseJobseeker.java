/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;
import java.util.ArrayList;

/** inisiasi class */
public class DatabaseJobseeker {
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    ;
    private static int lastId = 0;

    /**
     * method getter database jobseeker
     * @return database jobseeker
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    /**
     * method getter id terakhir
     * @return id terakhir
     */
    public static int getLastId() {
        return lastId;
    }

    /**
     * method getter jobseeker sesuai dengan id
     * @param id id jobseeker
     * @return jobseeker yang dicari
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        Jobseeker val = null;
        for (Jobseeker js : JOBSEEKER_DATABASE)
            if (id == js.getId())
                return js;
        throw new JobSeekerNotFoundException(id);
    }


    /**
     * method penambahan jobseeker
     * @param jobseeker jobseeker
     * @return true jika berhasil ditambah
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for(Jobseeker jobseekers : JOBSEEKER_DATABASE)
            if(jobseekers.getEmail() == jobseeker.getEmail())
                throw new EmailAlreadyExistsException(jobseeker);

        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }


    /**
     * method penghapusan jobseeker
     * @param id id
     * @return true jika jobseeker berhasil dihapus
     */
    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException{
        for (Jobseeker js : JOBSEEKER_DATABASE) {
            if (js.getId() == id) {
                JOBSEEKER_DATABASE.remove(js);
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /**
     * method untuk login jobseeker
     * @param email email jobseeker
     * @param password password jobseeker
     * @return jobseeker yang berhasil login
     */
    public static Jobseeker jobseekerLogin(String email, String password) {
        Jobseeker val = null;
        for (Jobseeker js : JOBSEEKER_DATABASE) {
            if (email.equals(js.getEmail()) && password.equals(js.getPassword())) {
                return js;
            }
        }
        return null;
    }
}