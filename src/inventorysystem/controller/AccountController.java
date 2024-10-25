package inventorysystem.controller;

import inventorysystem.model.Account;

public class AccountController {
    private Account account;
    private DatabaseController dc = new DatabaseController();
    public int createAccount(int company_ID, String f_name, String l_name, String username, String password, String access_level){
        int isCreated = 0;
        String sql = "INSERT INTO "
                + "Account(company_ID, first_name, last_name, username, password, access_level)"
                + "VALUES('"+company_ID+"', '"+f_name+"', '"+l_name+"', '"+username+"', '"+password+"', '"+access_level+"')";
        isCreated = this.dc.insertQuery(sql);
        return isCreated;
    }
    
    public boolean loadAccount(String username, String password){
        boolean isLogin = false;
        String sql = "SELECT * FROM Account "
                + "WHERE username = '"+username+"'";
        
        Account temp_account = this.dc.loadAccountQuery(sql);
        
        String account_password = temp_account.getPassword();
        
        if(account_password.equals(password)){
            isLogin = true;
        }
        
        if(isLogin){
            this.account = temp_account;
        }
        
        return isLogin;
    }
    
    public Account getAccount(){
        return this.account;
    }
}
