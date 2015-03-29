/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.CustomerRelationShip.getValue())) {
            organization = new CustomerRealtionShipOrganisation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FinanceOrganization.getValue())) {
            organization = new FinanceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ManageRetailer.getValue())) {
            organization = new ManageRetailerORganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ManageInventory.getValue())) {
            organization = new ManageInventoryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.OrderProcessing.getValue())) {
            organization = new OrderprocessingORganiztion();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RetailerFinanceOrganization.getValue())) {
            organization = new RetailerFinanceOrganiztion();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.ShipmentAndPAcking.getValue())) {
            organization = new ShipmentAndPAckingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RetailerOrderProcessing.getValue())) {
            organization = new RetailerOrderProcessingORganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.Lab.getValue())){
//            organization = new LabOrganization();
//            organizationList.add(organization);
//        }
        return organization;
    }

    public boolean checkOrgExists(Type type) {
        for (Organization o : organizationList) {
            if (type.getValue().equals(o.getName())) {
                return true;
            }
        }

        return false;
    }
}
