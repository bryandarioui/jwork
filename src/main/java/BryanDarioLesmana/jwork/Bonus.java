package BryanDarioLesmana.jwork;
/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version
 */
public class Bonus /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    
public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active){ 
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    public int getId(){
        return this.id;
    }

    public String getReferralCode(){
        return this.referralCode;
    }

    public int getExtraFee(){
        return this.extraFee;
    }

    public int getMinTotalFee(){
        return this.minTotalFee;
    }

    public boolean getActive(){
        return this.active;
    }

   
    public void setId(int id){
       this.id = id;
    }

    public void setReferralCode(String referralCode){
        this.referralCode = referralCode;
    }

    public void setExtraFee(int extraFee){
        this.extraFee = extraFee;
    }

    public void setMinTotalFee(int minTotalFee){
        this.minTotalFee = minTotalFee;
    }

    public void setActive(boolean active){
        this.active = active;
    }

public String toString(){
    return "Id = " + id +
            "\nReferral Code = " + referralCode +
            "\nExtraa Fee = " + extraFee +
            "\nMin Total Fee = " + minTotalFee +
            "\nActive Status = " + active ;
        }
        
    //public void printData(){
      //  System.out.println(id);
      //  System.out.println(referralCode);
      //  System.out.println(extraFee);
      //  System.out.println(minTotalFee);
      //  System.out.println(active);
    }
