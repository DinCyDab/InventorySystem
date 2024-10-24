package inventorysystem.controller;

import java.util.ArrayList;
import inventorysystem.model.Inventory;

public class InventoryController {
    private ArrayList<Inventory> inventories;
    private DatabaseController dc = new DatabaseController(); 
    
    public void createInventory(int company_ID, String name, String description){
        String sql = "INSERT INTO "
                + "Inventory(company_ID, name, description)"
                + "VALUES('"+company_ID+"' , '"+name+"', '"+description+"')";
        this.dc.insertQuery(sql);
    }
    
    public void loadInventory(int company_ID){
        String sql = "SELECT * FROM Inventory"
                + "WHERE company_ID = '"+company_ID+"'";
        this.inventories = this.dc.loadInventoryQuery(sql);
    }
    
    public ArrayList<Inventory> getInventory(){
        return this.inventories;
    }
}
