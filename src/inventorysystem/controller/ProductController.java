package inventorysystem.controller;

import inventorysystem.model.Product;
import java.util.ArrayList;

public class ProductController {
    private DatabaseController dc = new DatabaseController();
    private ArrayList<Product> products = new ArrayList<>();
    public void createProduct(int i_ID, String name, String desc, int qty){
        String sql = "INSERT INTO "
                + "Product(inventory_ID, product_name, product_description, quantity)"
                + "VALUES('"+i_ID+"', '"+name+"', '"+desc+"', '"+qty+"')";
        this.dc.insertQuery(sql);
    }
    
    public void loadProducts(int inventory_ID){
        String sql = "SELECT * FROM Products"
                + "WHERE inventory_ID = '"+inventory_ID+"'";
        this.products = this.dc.loadProductsQuery(sql);
    }
    
    public ArrayList<Product> getProducts(){
        return this.products;
    }
}
