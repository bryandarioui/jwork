/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */
package BryanDarioLesmana.jwork;

/**
 * inisiasi class
 */
public class OngoingInvoiceAlreadyExistsException extends Exception{

    private Invoice invoice_error;

    /**
     * constructor yang digunakan
     */
    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Jobseeker Email : ") ;
        invoice_error = invoice_input;
    }

    /**
     * method menampilkan hasil error
     */
    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
