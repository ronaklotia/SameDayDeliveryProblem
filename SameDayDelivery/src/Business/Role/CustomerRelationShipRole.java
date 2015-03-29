/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerRealtionShipOrganisation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRealtionshipRole.CustomerRealtionWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Avi
 */
public class CustomerRelationShipRole extends Role {

    private CustomerDirectory customerDirectory;

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerRealtionWorkArea(userProcessContainer, (CustomerRealtionShipOrganisation)organization);
    }
}
