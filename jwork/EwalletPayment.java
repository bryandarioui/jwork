public class EwalletPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus){
    super(id, job, jobseeker, invoiceStatus);
    }
    
    public EwalletPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus, Bonus bonus){
    super(id, job, jobseeker, invoiceStatus);
    this.bonus = bonus;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE; 
    }
    public Bonus getBonus(){
        return bonus;
    }
    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }
    public void setTotalFee(){
        if(bonus != null && bonus.getActive() == true && (getJob().getFee() > getBonus().getMinTotalFee())){
           super.totalFee = (getJob().getFee() + bonus.getExtraFee());
    }else{
        super.totalFee = getJob().getFee();
    }
    }
    
    @Override
    public String toString()
    {
        if (getJob().getFee() != totalFee) {
                return "\n==========Invoice==========" +
                "\nID: "+ super.getId() +
                "\nJob: "+ super.getJob().getName() +
                "\nDate: "+ super.getDate() +
                "\nJob Seeker: "+ super.getJobseeker().getName() +
                "\nTotal Fee: "+ super.totalFee +
                "\nBonus: " + bonus.getReferralCode() +
                "\nStatus:  "+ super.getInvoiceStatus().toString() +
                "\nPayment Type: "+ PAYMENT_TYPE.toString();
        }else{
        return "\n==========Invoice==========" +
                "\nID: "+ super.getId() +
                "\nJob: "+ super.getJob().getName() +
                "\nDate: "+ super.getDate() +
                "\nJob Seeker: "+ super.getJobseeker().getName() +
                "\nTotal Fee: "+ super.totalFee +
                "\nStatus:  "+ super.getInvoiceStatus().toString() +
                "\nPayment Type: "+ PAYMENT_TYPE.toString();
    }
    
    /*public void printData()
    {
        System.out.println("==========Invoice==========");
        System.out.println("ID: "+ super.getId());
        System.out.println("Job: "+ super.getJob().getName());
        System.out.println("Date: "+ super.getDate());
        System.out.println("Job Seeker: "+ super.getJobseeker().getName());
        System.out.println("Total Fee: "+ super.totalFee);

        if (getJob().getFee() != totalFee) {
            System.out.println("Bonus "+ bonus.getReferralCode());
        }

        System.out.println("Status:  "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type: "+ PAYMENT_TYPE.toString());
    */
}
}
