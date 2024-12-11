package inventorysystem.controller;

import inventorysystem.model.Company;

public class CompanyController {
    private DatabaseController dc = new DatabaseController();
    private Company company;
    
    public CompanyController(){
        
    }
    
    public CompanyController(int company_ID){
        this.loadCompany(company_ID);
    }
    
    public int createCompany(String name, String description){
        int inserted_ID = 0;
        
        String sql = "INSERT INTO "
                + "Company(company_name, company_description) "
                + "VALUES('"+name+"', '"+description+"')";
        inserted_ID = this.dc.insertQuery(sql);
        return inserted_ID;
    }
    
    public void loadCompany(int company_ID){
        String sql = "SELECT * FROM Company "
                + "WHERE company_ID = '"+company_ID+"'";
        this.company = this.dc.loadCompanyQuery(sql);
    }
    
    public Company getCompany(){
        return this.company;
    }
}
