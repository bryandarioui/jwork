/**
 * @author Bryan Dario Lesmana (1806199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

/**
 * inisiasi class
 */
public class ReferralCodeAlreadyExistsException extends Exception {
    /**
     * variabel referral error
     */
    private Bonus referral_error;

    /**
     * constructor untuk referral code already exist
     * @param referral_input referral_input
     */
    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Jobseeker Email : ") ;
        referral_error = referral_input;
    }

    @Override
    /**
     * method menghasilkan pesan error
     */
    public String getMessage() {
        return super.getMessage() + referral_error + "already exists.";
    }
}