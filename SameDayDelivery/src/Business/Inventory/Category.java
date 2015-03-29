/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

/**
 *
 * @author Abhishek
 */
public class Category {

    private String name;

    private ProductCatalog productCatalog;

    public Category() {
        productCatalog = new ProductCatalog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    @Override
    public String toString() {
        return name;
    }
    
    

}
