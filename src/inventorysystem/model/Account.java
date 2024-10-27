package inventorysystem.model;

public class Account {
    private int account_ID;
    private int company_ID;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String access_level;
    private String status;
    private String email;
    
    public Account(int a_ID, int c_ID, String f_name, String l_name, String username, String password, String access_level, String status, String email){
        this.account_ID = a_ID;
        this.company_ID = c_ID;
        this.first_name = f_name;
        this.last_name = l_name;
        this.username = username;
        this.password = password;
        this.access_level = access_level;
        this.status = status;
        this.email = email;
    }
    public int getAccountID(){
        return this.account_ID;
    }
    public int getCompanyID(){
        return this.company_ID;
    }
    public String getFirstName(){
        return this.first_name;
    }
    public String getLastName(){
        return this.last_name;
    }
    public String getUsername(){
        return this.username;
    }
    public String getAccessLevel(){
        return this.access_level;
    }
    public String getPassword(){
        return this.password;
    }
    public String getStatus(){
        return this.status;
    }
    public String getEmail(){
        return this.email;
    }
    public void setFirstName(String first_name){
        this.first_name = first_name;
    }
    public void setLastName(String last_name){
        this.last_name = last_name;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setAccessLevel(String access_level){
        this.access_level = access_level;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setString(String email){
        this.email = email;
    }
}
