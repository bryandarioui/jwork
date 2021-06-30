/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
package BryanDarioLesmana.jwork;

/**
 * inisiasi class
 */
public class EmailAlreadyExistsException extends Exception {
    /**
     * variabel jobseeker error
     */
    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email : ") ;
        jobseeker_error = jobseeker_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + "already exists.";
    }
}

