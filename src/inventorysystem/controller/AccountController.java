package inventorysystem.controller;

import inventorysystem.model.Account;

public class AccountController {
    private Account account;
    private DatabaseController dc = new DatabaseController();
    public void createAccount(int company_ID, String f_name, String l_name, String username, String password, String access_level){
        String sql = "INSERT INTO "
                + "Account(company_ID, first_name, last_name, username, password, access_level)"
                + "VALUES('"+company_ID+"', '"+f_name+"', '"+l_name+"', '"+username+"', '"+password+"', '"+access_level+"')";
        this.dc.insertQuery(sql);
    }
    
    public void loadAccount(String username){
        String sql = "SELECT * FROM Account"
                + "WHERE username = '"+username+"'";
        this.account = this.dc.loadAccountQuery(sql);
    }
    
    public Account getAccount(){
        return this.account;
    }
}
