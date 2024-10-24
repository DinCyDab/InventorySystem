package inventorysystem.model;

public class Company {
    private int company_ID;
    private String company_name;
    private String company_description;
    
    public Company(int company_ID, String company_name, String company_description){
        this.company_ID = company_ID;
        this.company_name = company_name;
        this.company_description = company_description;
    }
    public int getCompanyID(){
        return this.company_ID;
    }
    public String getCompanyName(){
        return this.company_name;
    }
    public String getCompanyDescription(){
        return this.company_description;
    }
    public void setCompanyName(String company_name){
        this.company_name = company_name;
    }
    public void setCompanyDescription(String company_description){
        this.company_description = company_description;
    }
}
