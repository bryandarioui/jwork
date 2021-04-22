public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");
    
    private String paymenttype;
    
    PaymentType(String paymenttype){
        this.paymenttype = paymenttype;
}
    
    public String toString(){
        return paymenttype;
    }
}


