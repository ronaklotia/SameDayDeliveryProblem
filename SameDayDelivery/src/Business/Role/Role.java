/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Customer("Customer"),
        RetailerRoel("Retailer"),
        ManageRetailer("ManageRetailer"),
        OrderProcessingRole("ORderProcessingRole"),
        AccountPayableRole("AccountPayablle"),
        AccountReceivableRole("AccountRecivableRole"),
        CustomerRelationShipRole("CustomerRelationShipRole"),
        RetailerORderPRocessing("ORderProcessingRole"),
        RetailerAccountPAyableRole("AccountPAyableRole"),
        RetailerAccountRecivableRole("AcoountREcivableRole"),
        REtailerShipmentAndPAckingRole("ShipmentAndPAckingRole"),
        SystemAdminRole("System Admin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}