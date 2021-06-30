/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

//clas bonus not found exception//
public class BonusNotFoundException extends Exception {
    private int bonus_error;

    /**
     * constructor bonus not found exception
     * @param bonus_input
     */
    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    /**
     * method getter untuk pesan error
     */
    @Override
    public String getMessage() {
        return super.getMessage() + bonus_error + "Not Found";
    }
}
