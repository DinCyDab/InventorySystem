package inventorysystem.controller;

import java.sql.*;
import inventorysystem.model.*;
import java.util.ArrayList;

public class DatabaseController {
    private final String url = "jdbc:mysql://localhost:3306/inventorymanagement";
    private final String username = "root";
    private final String password = "";
    
    public int insertQuery(String sql){
        int inserted_ID = 0;
        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            
            inserted_ID = rs.getInt(1);
            
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        return inserted_ID;
    }
    
    public Company loadCompanyQuery(String sql){
        Company company = null;
        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            
            ResultSet result = conn.createStatement().executeQuery(sql);
            
            int company_ID = result.getInt("company_ID");
            String company_name = result.getString("company_name");
            String company_description = result.getString("company_description");
            
            company = new Company(company_ID, company_name, company_description);
            
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        return company;
    }
    
    public Account loadAccountQuery(String sql){
        Account account = null;
        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            
            ResultSet result = conn.createStatement().executeQuery(sql);
            
            int account_ID = result.getInt("account_ID");
            int company_ID = result.getInt("company_ID");
            String first_name = result.getString("first_name");
            String last_name = result.getString("last_name");
            String usernamE = result.getString("username");
            String access_level = result.getString("access_level");
            
            account = new Account(account_ID, company_ID, first_name, last_name, usernamE, access_level);
            
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        return account;
    }
    public ArrayList<Product> loadProductsQuery(String sql){
        ArrayList<Product> products = new ArrayList<>();
        
        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            
            ResultSet result = conn.createStatement().executeQuery(sql);
            
            while(result.next()){
                Product product;
                int product_ID = result.getInt("product_ID");
                int inventory_ID = result.getInt("inventory_ID");
                String product_name = result.getString("product_name");
                String product_description = result.getString("product_description");
                int quantity = result.getInt("quantity");
                
                product = new Product(product_ID, inventory_ID, product_name, product_description, quantity);
                
                products.add(product);
            }
            
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        
        return products;
    }
    public ArrayList<Inventory> loadInventoryQuery(String sql){
        ArrayList<Inventory> inventories = new ArrayList<>();
        
        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            
            ResultSet result = conn.createStatement().executeQuery(sql);
            
            while(result.next()){
                Inventory inventory;
                
                int i_ID = result.getInt("inventory_ID");
                int c_ID = result.getInt("company_ID");
                String name = result.getString("inventory_name");
                String description = result.getString("description");
                
                inventory = new Inventory(i_ID, c_ID, name, description);
                
                inventories.add(inventory);
            }
            
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        
        return inventories;
    }
    public ArrayList<Report> loadReportsQuery(String sql){
        ArrayList<Report> reports = new ArrayList<>();
        
        try{
            Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            
            ResultSet result = conn.createStatement().executeQuery(sql);
            
            while(result.next()){
                Report report;
                
                int report_ID = result.getInt("report_ID");
                int account_ID = result.getInt("account_ID");
                int product_ID = result.getInt("product_ID");
                Date report_date = result.getDate("report_date");
                Time report_time = result.getTime("report_time");
                int consumed = result.getInt("consumed");
                String status = result.getString("status");
                
                report = new Report(report_ID, account_ID, product_ID, report_date, report_time, consumed, status);
                
                reports.add(report);
            }
            
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        
        return reports;
    }
}