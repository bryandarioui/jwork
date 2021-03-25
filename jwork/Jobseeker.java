/**
 * 
 * @author(Bryan Dario Lesmana Chikwado)
 * @version(Modul2-25.03.2021)
 */
public class Jobseeker /** inisiasi class */
{
    private int id; /** inisiasi variabel */
    private String name;
    private String email;
    private String password;
    private String joinDate;

 /**
 * constructor 
 * @param id id pada jobseeker
 * @param name nama pencari kerja pada jobseeker
 * @param email email pencari kerja pada jobseeker
 * @param password password dari jobseeker
 * @param joinDate tanggal join dari jobseeker 
 */
    public Jobseeker(int id,String name, String email, String password,String joinDate){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
/**
 * getter id dari jobseeker 
 * @return id dari jobseeker 
 */ 
    public int getId(){
        return this.id;
    }
/**
 * getter nama pencari pekerjaan dari jobseeker
 * @return nama pencari pekerjaan dari jobseeker 
 */
    public String getName(){
        return this.name;
    }
/**
 * getter email pencari kerja pada jobseeker 
 * @return email pencari kerja pada jobseeker
 */
    public String getEmail(){
        return this.email;
    }
/**
 * getter password dari jobseeker
 * @return password dari jobseeker 
 */
    public String getPassword(){
        return this.password;
    } 
/**
 * getter tanggal join dari jobseeker  
 * @return tanggal join dari jobseeker 
 */
    public String getJoinDate(){
        return this.joinDate;
    }
/**
 * setter id dari jobseeker 
 * @param id dari jobseeker 
 */
    public void setId(int id){ 
        this.id = id;
    }
/**
 * setter nama pencari pekerjaan dari jobseeker
 * @param nama pencari pekerjaan dari jobseeker 
 */
    public void setName(String name){ 
        this.name = name;
    }
/**
 * setter email pencari kerja pada jobseeker 
 * @param email pencari kerja pada jobseeker
 */
    public void setEmail(String Email){
        this.email = email;
    }
/**
 * setter password dari jobseeker
 * @param password dari jobseeker 
 */
    public void setPassword(String Password){
        this.password = password;
    }
/**
 * setter tanggal join dari jobseeker  
 * @param tanggal join dari jobseeker 
 */
    public void setJoindate(String JoinDate){
        this.joinDate = joinDate;
    }  
/**
 * method untuk print nama dari jobseeker
 * outputnya adalah id, nama, email, password, tanggal join pencari kerja
 */
    public void printData(){
     System.out.println("==== Job Seeker ====");
     System.out.println("Id: " + getId());
     System.out.println("Name: " + getName());
     System.out.println("Email: " + getEmail());
     System.out.println("Password: " + getPassword());
     System.out.println("Join: " + getJoinDate());
    }
}
