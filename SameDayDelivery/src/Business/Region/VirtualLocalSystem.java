/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Region;

import Business.Enterprise.EnterpriseDirectory;
import Business.Inventory.CategoryDirectory;

/**
 *
 * @author Abhishek
 */
public class VirtualLocalSystem {

    private EnterpriseDirectory enterpriseDirectory;
    private CategoryDirectory categoryDirectory;

    public VirtualLocalSystem() {
        categoryDirectory = new CategoryDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public CategoryDirectory getCategoryDirectory() {
        return categoryDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

}
