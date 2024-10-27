package inventorysystem.controller;

import java.util.ArrayList;
import inventorysystem.model.Inventory;

public class InventoryController {
    private ArrayList<Inventory> inventories;
    private DatabaseController dc = new DatabaseController(); 
    
    public InventoryController(){
        
    }
    
    public InventoryController(int company_ID){
        this.loadInventory(company_ID);
    }
    
    public void createInventory(int company_ID, String name, String description){
        String sql = "INSERT INTO "
                + "Inventory(company_ID, inventory_name, description) "
                + "VALUES('"+company_ID+"', '"+name+"', '"+description+"')";
        this.dc.insertQuery(sql);
    }
    
    public void updateInventory(int inventory_ID, String status){
        String sql = "UPDATE inventory "
                + "SET status = '"+status+"' "
                + "WHERE inventory_ID = '"+inventory_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void updateInventory(int inventory_ID, String name, String description){
        String sql = "UPDATE inventory "
                + "SET inventory_name = '"+name+"', "
                + "description = '"+description+"'"
                + "WHERE inventory_ID = '"+inventory_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void loadInventory(int company_ID){
        String sql = "SELECT * FROM Inventory "
                + "WHERE company_ID = '"+company_ID+"'";
        this.inventories = this.dc.loadInventoryQuery(sql);
    }
    
    public ArrayList<Inventory> getActiveInventories(int company_ID){
        ArrayList<Inventory> active_inventories;
        String sql = "SELECT * FROM Inventory "
                + "WHERE company_ID = '"+company_ID+"' "
                + "AND status = 'Active'";
        active_inventories = this.dc.loadInventoryQuery(sql);
        return active_inventories;
    }
    
    public ArrayList<Inventory> getInventory(){
        return this.inventories;
    }
}
