/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Invoice.AccountPayable;
import Business.Invoice.AccountRecivable;
import Business.Role.ManageInventoryRole;
import Business.Role.RetailerAccountRecivableRle;
import Business.Role.RetalerAccountPAyableRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class RetailerFinanceOrganiztion extends Organization {

    private AccountPayable accountPayable;
    private AccountRecivable accountRecivable;

    public RetailerFinanceOrganiztion() {

        super(Type.RetailerFinanceOrganization.getValue());
        accountPayable = new AccountPayable();
        accountRecivable = new AccountRecivable();
    }

    public AccountPayable getAccountPayable() {
        return accountPayable;
    }

    public AccountRecivable getAccountRecivable() {
        return accountRecivable;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new RetailerAccountRecivableRle());
        roleList.add(new RetalerAccountPAyableRole());
        return roleList;
    }

}
