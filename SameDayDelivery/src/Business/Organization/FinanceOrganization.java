/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AccountPAyableRole;
import Business.Role.AccountReceivableRole;
import Business.Role.ManageInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class FinanceOrganization extends Organization{

    private AccountPAyableRole accountPAyableRole;
    private AccountReceivableRole accountReceivableRole;
    public FinanceOrganization() {
      
        super(Type.FinanceOrganization.getValue());
          accountPAyableRole= new AccountPAyableRole();
        accountReceivableRole= new AccountReceivableRole();
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new AccountPAyableRole());
        roleList.add(new AccountReceivableRole());
        return roleList;
    }
    
}
