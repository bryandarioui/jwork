/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;
/**
 * inisiiasi class
 */
public class JobNotFoundException extends Exception {
    private int job_error;

    /**
     * constructor yang digunakan
     * @param
     */
    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    @Override
    /**
     * method getmessage untuk menampilkan error
     */
    public String getMessage() {
        return super.getMessage() + job_error + "Not Found";
    }
}
