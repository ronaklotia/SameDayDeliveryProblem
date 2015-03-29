/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.ManageInventoryRole;
import Business.Role.Role;
import Business.Role.ShipmentAndPAckingRole;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ShipmentAndPAckingOrganization extends Organization{

    public ShipmentAndPAckingOrganization() {
        super(Type.ShipmentAndPAcking.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new ShipmentAndPAckingRole());
        return roleList;
    }
    
}
