/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Role.CustomerRelationShipRole;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Avi
 */
public class CustomerRealtionShipOrganisation extends Organization {

    private CustomerDirectory customerDirectory;
    
    
    public CustomerRealtionShipOrganisation() {
        super(Type.CustomerRelationShip.getValue());
        customerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerRelationShipRole());
        return roles;
    }
}
