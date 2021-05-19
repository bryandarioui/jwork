package BryanDarioLesmana.jwork;
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String text;
    
    InvoiceStatus(String text){
        this.text = text;
}
    
    @Override
    public String toString(){
        return text;
    }
}
