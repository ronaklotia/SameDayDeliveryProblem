/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.ManageInventoryRole;
import Business.Role.ManageRetailerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ManageRetailerORganization extends Organization{

    public ManageRetailerORganization() {
        super(Type.ManageRetailer.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new ManageRetailerRole());
        return roleList;
    }
    
}
