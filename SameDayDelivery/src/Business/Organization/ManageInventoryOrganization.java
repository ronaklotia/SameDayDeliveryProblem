/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.CategoryDirectory;
import Business.Inventory.ProductCatalog;
import Business.Role.ManageInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ManageInventoryOrganization extends Organization {

    private ProductCatalog productCatalog;

    public ManageInventoryOrganization() {
        super(Type.ManageInventory.getValue());
        productCatalog = new ProductCatalog();
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new ManageInventoryRole());
        return roleList;
    }

}
