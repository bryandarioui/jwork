package BryanDarioLesmana.jwork;
/**
 * @author Nisrina Athallah (1806148813)
 * @version 28/06/21
 */
public class Location /** inisiasi class */
{
    private String province; /** inisiasi variabel */
private String city;
    private String description;

    /**
     * constructor
     * @param province provinsi dari location
     * @param city nama kota dari location
     * @param description deskripsi tempat dari location
     */
    public Location(String province, String city,String description ){
        this.province = province;
        this.city = city;
        this.description = description;
    }
    /**
     * getter provinsi dari location
     * @return provinsi dari location
     */
    public String getProvince(){
        return this.province;
    }
    /**
     * getter nama kota dari location
     * @return nama kota dari location
     */
    public String getCity(){
        return this.city;
    }
    /**
     * getter deskripsi dari location
     * @return deskripsi dari location
     */
    public String getDescription(){
        return this.description;
    }
    /**
     * setter provinsi dari location
     * @param province provinsi
     */
    public void setProvince(String province){
        this.province = province;
    }
    /**
     * setter nama kota dari location
     * @param city kota
     */
    public void setCity(String city){
        this.city = city;
    }
    /**
     * setter deskripsi dari location
     * @param description deskripsi kota
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * method toString untuk menghasilkan location
     */
    public String toString(){
        return "Province = " + province +
                "\nCity = " + city +
                "\nDescription = " + description;
    }
/**
 * method untuk print provinsi dari location
 * outputnya adalah nama provinsi
 */
    //public void printData(){
    //System.out.println("==== Location ====");
    //System.out.println("Province: " + getProvince());
    //System.out.println("City: " + getCity());
    //System.out.println("Description: " + getDescription());
}
