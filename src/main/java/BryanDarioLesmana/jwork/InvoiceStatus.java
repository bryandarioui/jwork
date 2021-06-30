/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

/** inisiasi class */
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");

    private String text;

    /**
     * constructor pada enum
     * @param text
     */
    InvoiceStatus(String text){
        this.text = text;
    }

    /**
     * method untuk menghasilkan status invoice
     */
    @Override
    public String toString(){
        return text;
    }
}
