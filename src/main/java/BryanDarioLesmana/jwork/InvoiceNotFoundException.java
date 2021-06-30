/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

//class invoice not found exception//
public class InvoiceNotFoundException extends Exception{

    private int invoice_error;

    /**
     * constructor yang digunakan
     * @param invoice_input
     */
    public InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    @Override
    /**
     * method getmessage untuk menampilkan error
     */
    public String getMessage() {
        return super.getMessage() + invoice_error + "Not Found";
    }

}
