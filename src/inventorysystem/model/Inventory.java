package inventorysystem.model;

public class Inventory {
    private int inventory_ID;
    private int company_ID;
    private String inventory_name;
    private String inventory_description;
    public Inventory(int inventory_ID, int company_ID, String inventory_name, String inventory_description){
        this.inventory_ID = inventory_ID;
        this.company_ID = company_ID;
        this.inventory_name = inventory_name;
        this.inventory_description = inventory_description;
    }
    public int getInventoryID(){
        return this.inventory_ID;
    }
    public int getCompanyID(){
        return this.company_ID;
    }
    public String getInventoryName(){
        return this.inventory_name;
    }
    public String getInventoryDescription(){
        return this.inventory_description;
    }
    public void setInventoryName(String name){
        this.inventory_name = name;
    }
    public void getInventoryDescription(String description){
        this.inventory_description = description;
    }
}
