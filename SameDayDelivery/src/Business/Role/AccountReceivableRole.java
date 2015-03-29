/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FinanceRole.AccountRecievableRole.AccountRecivableWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class AccountReceivableRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AccountRecivableWorkAreaJPanel((FinanceOrganization) organization, userProcessContainer);
    }
    
}
