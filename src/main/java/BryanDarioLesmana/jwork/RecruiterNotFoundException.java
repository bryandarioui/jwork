/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
package BryanDarioLesmana.jwork;

/**
 * inisiasi class
 */
public class RecruiterNotFoundException extends Exception {
    /**
     * variabel recruiter error
     */
    private int recruiter_error;

    /**
     * constructor recruiter not found exception
     * @param recruiter_input recruiter_input
     */
    public RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    @Override
    /**
     * method untuk menampilkan pesan error
     */
    public String getMessage() {
        return super.getMessage() + recruiter_error + "Not Found";
    }
}