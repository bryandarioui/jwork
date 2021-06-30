/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;
import java.util.ArrayList;

/** inisiasi class */
public class FeeCalculator implements Runnable{

    /**
     * metod run untuk menghitung
     */
    public void run(){
        ArrayList<Invoice> list = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice i : list){
            System.out.println("calculating invoice id: "+ i.getId());
            i.setTotalFee();
            System.out.println("finished calculating invoice id: "+ i.getId());

        }

    }
}
