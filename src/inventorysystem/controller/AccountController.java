package inventorysystem.controller;

import inventorysystem.model.Account;
import java.util.ArrayList;

public class AccountController {
    private Account account;
    private DatabaseController dc = new DatabaseController();
    public int createAccount(int company_ID, String f_name, String l_name, String username, String password, String access_level, String email){
        int isCreated = 0;
        String sql = "INSERT INTO "
                + "Account(company_ID, first_name, last_name, username, password, access_level, email)"
                + "VALUES('"+company_ID+"', '"+f_name+"', '"+l_name+"', '"+username+"', '"+password+"', '"+access_level+"', '"+email+"')";
        isCreated = this.dc.insertQuery(sql);
        return isCreated;
    }
    
    public boolean findUsername(String username){
        Account is_found = null;
        String sql = "SELECT * FROM Account WHERE username = '"+username+"'";
        is_found = this.dc.loadAccountQuery(sql);
        if(is_found != null){
            return true;
        }
        return false;
    }
    
    public boolean findEmail(String email){
        Account is_found = null;
        String sql = "SELECT * FROM Account WHERE email = '"+email+"'";
        is_found = this.dc.loadAccountQuery(sql);
        if(is_found != null){
            return true;
        }
        return false;
    }
    
    public void editPassword(int account_ID, String password){
        String sql = "UPDATE Account "
                + "SET password = '"+password+"' "
                + "WHERE account_ID = '"+account_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void setAccountStatus(int account_ID, String status){
        String sql = "UPDATE Account "
                + "SET status = '"+status+"' "
                + "WHERE account_ID = '"+account_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void editAccount(int account_ID, String f_name, String l_name, String email, String access_level){
        String sql = "UPDATE Account "
                + "SET first_name = '"+f_name+"', "
                + "last_name = '"+l_name+"', "
                + "email = '"+email+"', "
                + "access_level = '"+access_level+"' "
                + "WHERE account_ID = '"+account_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void editAccount(int account_ID, String f_name, String l_name, String password, String email, String access_level){
        String sql = "UPDATE Account "
                + "SET first_name = '"+f_name+"', "
                + "last_name = '"+l_name+"', "
                + "password = '"+password+"', "
                + "email = '"+email+"', "
                + "access_level = '"+access_level+"' "
                + "WHERE account_ID = '"+account_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public boolean loadAccount(String username, String password){
        boolean isLogin = false;
        String sql = "SELECT * FROM Account "
                + "WHERE username = '"+username+"'";
        
        Account temp_account = this.dc.loadAccountQuery(sql);
        
        if(temp_account == null){
            System.out.println("Account not found");
            return false;
        }
        
        String account_password = temp_account.getPassword();
        
        if(account_password.equals(password)){
            isLogin = true;
        }
        
        if(isLogin){
            this.account = temp_account;
        }
        
        return isLogin;
    }
    
    public ArrayList<Account> getAccounts(int company_ID){
        ArrayList<Account> accounts = null;
        String sql = "SELECT * FROM Account "
                + "WHERE company_ID = '"+company_ID+"'";
        accounts = this.dc.loadAccountsQuery(sql);
        return accounts;
    }
    
    public ArrayList<Account> getAccounts(int company_ID, String status){
        ArrayList<Account> accounts = null;
        String sql = "SELECT * FROM Account "
                + "WHERE company_ID = '"+company_ID+"' "
                + "AND status = '"+status+"'";
        accounts = this.dc.loadAccountsQuery(sql);
        return accounts;
    }
    
    public Account getAccount(){
        return this.account;
    }
}
