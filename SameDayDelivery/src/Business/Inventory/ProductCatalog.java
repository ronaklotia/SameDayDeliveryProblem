/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ProductCatalog {

    private ArrayList<Product> producdList;

    public ProductCatalog() {
        producdList = new ArrayList<>();
    }

    public ArrayList<Product> getProducdList() {
        return producdList;
    }

    
    public Product createAndAddProduct(){
        Product p = new Product();
        producdList.add(p);
        return p;
    }
}
