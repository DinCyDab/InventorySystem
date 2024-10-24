package inventorysystem.model;

public class Product {
    private int product_ID;
    private int inventory_ID;
    private String product_name;
    private String product_description;
    private int quantity;
    
    public Product(int p_ID, int i_ID, String name, String desc, int qty){
        this.product_ID = p_ID;
        this.inventory_ID = i_ID;
        this.product_name = name;
        this.product_description = desc;
        this.quantity = qty;
    }
    public int getProductID(){
        return this.product_ID;
    }
    public int getInventoryID(){
        return this.inventory_ID;
    }
    public String getProductName(){
        return this.product_name;
    }
    public String getProductDescription(){
        return this.product_description;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setProductName(String name){
        this.product_name = name;
    }
    public void setProductDescription(String description){
        this.product_description = description;
    }
    public void setQuantity(int qty){
        this.quantity = qty;
    }
}
