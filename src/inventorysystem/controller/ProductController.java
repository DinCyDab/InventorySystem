package inventorysystem.controller;

import inventorysystem.model.Product;
import java.util.ArrayList;

public class ProductController {
    private DatabaseController dc = new DatabaseController();
    private ArrayList<Product> products = new ArrayList<>();
    
    public ProductController(){
        
    }
    
    public ProductController(int inventory_ID){
        this.loadProducts(inventory_ID);
    }
    
    public void createProduct(int i_ID, String name, String desc){
        String sql = "INSERT INTO "
                + "Product(inventory_ID, product_name, product_description)"
                + "VALUES('"+i_ID+"', '"+name+"', '"+desc+"')";
        this.dc.insertQuery(sql);
    }
    
    public void updateProduct(int p_ID, String status){
        String sql = "UPDATE Product "
                + "SET status = '"+status+"' "
                + "WHERE product_ID = '"+p_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void updateProduct(int p_ID, int i_ID, String name, String desc){
        String sql = "UPDATE Product "
                + "SET inventory_ID = '"+i_ID+"', "
                + " product_name = '"+name+"', "
                + " product_description = '"+desc+"' "
                + "WHERE product_ID = '"+p_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void loadProducts(int inventory_ID){
        String sql = "SELECT * FROM Product "
                + "WHERE inventory_ID = '"+inventory_ID+"'";
        this.products = this.dc.loadProductsQuery(sql);
    }
    
    public ArrayList<Product> loadActiveProducts(int inventory_ID){
        ArrayList<Product> productS = null;
        String sql = "SELECT * FROM Product "
                + "WHERE inventory_ID = '"+inventory_ID+"' "
                + "AND status = 'Active'";
        productS = this.dc.loadProductsQuery(sql);
        return productS;
    }
    
    public ArrayList<Product> getProducts(){
        return this.products;
    }
}
