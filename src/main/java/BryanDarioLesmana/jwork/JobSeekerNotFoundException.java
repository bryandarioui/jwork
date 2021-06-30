/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

/**
 * inisiasi class
 */
public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    /**
     * constructor jobseeker not found exception
     * @param jobseeker_input
     */
    public JobSeekerNotFoundException(int jobseeker_input){
        super("Jobseeker ID: ");
        jobseeker_error = jobseeker_input;
    }

    @Override
    /**
     * method menghasilkan pesan error
     */
    public String getMessage() {
        return super.getMessage() + jobseeker_error + "Not Found";
    }
}