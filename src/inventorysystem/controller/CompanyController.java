package inventorysystem.controller;

import inventorysystem.model.Company;

public class CompanyController {
    private DatabaseController dc = new DatabaseController();
    private Company company;
    
    public int createCompany(String name, String description){
        int inserted_ID;
        
        String sql = "INSERT INTO "
                + "Company(company_name, company_description)"
                + "VALUES('"+name+"', '"+description+"')";
        inserted_ID = this.dc.insertQuery(sql);
        
        return inserted_ID;
    }
    
    public void loadCompany(int account_ID){
        String sql = "SELECT * FROM Company"
                + "WHERE account_ID = '"+account_ID+"'";
        this.company = this.dc.loadCompanyQuery(sql);
    }
    
    public Company getCompany(){
        return this.company;
    }
}
