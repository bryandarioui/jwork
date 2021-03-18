public class Jobseeker
{
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    public Jobseeker(int id,String name, String email, String password,String joinDate){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }   
    public String getJoinDate(){
        return this.joinDate;
    }
    public void setId(int id){ 
        this.id = id;
    }
    public void setName(String name){ 
        this.name = name;
    }
    public void setEmail(String Email){
        this.email = email;
    }
    public void setPassword(String Password){
        this.password = password;
    }
    public void setJoindate(String JoinDate){
        this.joinDate = joinDate;
    }    
    public void printData(){
        System.out.println("Pencari kerja " + getName());
    }
}
