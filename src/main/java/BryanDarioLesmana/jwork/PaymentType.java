/**
 * @author Bryan Dario Lesmana(18016199940)
 * @version 28/06/21
 */

package BryanDarioLesmana.jwork;

/**
 * inisiasi enum
 */
public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");

    private String paymenttype;

    PaymentType(String paymenttype){
        this.paymenttype = paymenttype;
    }

    /**
     * method untuk menghasilkan paymenttype
     */
    public String toString(){
        return paymenttype;
    }
}


