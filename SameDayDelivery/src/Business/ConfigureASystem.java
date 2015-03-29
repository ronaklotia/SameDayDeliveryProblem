/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RetailerEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerRealtionShipOrganisation;
import Business.Organization.Organization;

import Business.Region.Region;
import Business.Role.AccountPAyableRole;
import Business.Role.AccountReceivableRole;
import Business.Role.AdminRole;

import Business.Role.CustomerRelationShipRole;
import Business.Role.CustomerRole;
import Business.Role.ManageInventoryRole;
import Business.Role.ManageRetailerRole;
import Business.Role.OrderPRocessingRole;
import Business.Role.RetailerAccountRecivableRle;
import Business.Role.RetailerORderPRocessingRole;
import Business.Role.RetailerRole;
import Business.Role.RetalerAccountPAyableRole;
import static Business.Role.Role.RoleType.OrderProcessingRole;
import Business.Role.ShipmentAndPAckingRole;

import Business.Role.SystemAdminRole;

import Business.State.State;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AddRetailerWorkRequest;

/**
 *
 * @author raunak
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Employee employee = new Employee();
        employee.setName("Raunak Agarwal");

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("s");
        userAccount.setPassword("s");
        userAccount.setEmployee(employee);
        userAccount.setRole(new SystemAdminRole());

        system.getUserAccountDirectory().getUserAccountList().add(userAccount);


        Network network = system.getNetworkDirectory().createAndAddNetwork("India (IN)");
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Amazon India", Enterprise.EnterpriseType.AMAZON);
        UserAccount createUserAccount = enterprise.getUserAccountDirectory().createUserAccount("ankit", "ankit", new AdminRole());
        Employee createEmployee = enterprise.getEmployeeDirectory().createEmployee("Ankit");
        createUserAccount.setEmployee(createEmployee);

        Organization o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.CustomerRelationShip);
        UserAccount userAccount1 = o.getUserAccountDirectory().createUserAccount("avi", "avi", new CustomerRelationShipRole());
        Employee e = o.getEmployeeDirectory().createEmployee("Avi");
        userAccount1.setEmployee(e);

        CustomerRealtionShipOrganisation crso = (CustomerRealtionShipOrganisation) o;
        Customer c = crso.getCustomerDirectory().createAndAddCustomer();
        c.setAddress("Malad");
        c.setN(network);
//        c.setEmailID("ronak@abc.com");
        c.setPhoneNo("35534556");
        c.setRegion("Mumbai");
        c.setState("Maharashtra");
        c.setName("Ronak");
//        Finance finance = new Finance();
//        c.setFinance(finance);

        UserAccount account11 = crso.getUserAccountDirectory().createUserAccount("d", "d", new CustomerRole());
        account11.setCustomer(c);

        Organization o1 = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.OrderProcessing);
        UserAccount userAccount2 = o1.getUserAccountDirectory().createUserAccount("swap", "swap", new OrderPRocessingRole());
        Employee employee1 = o1.getEmployeeDirectory().createEmployee("swap");
        userAccount2.setEmployee(employee1);

        Organization o2 = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.ManageRetailer);
        UserAccount userAccount3 = o2.getUserAccountDirectory().createUserAccount("sohil", "sohil", new ManageRetailerRole());
        Employee employee2 = o2.getEmployeeDirectory().createEmployee("sohil");
        userAccount3.setEmployee(employee2);
        AddRetailerWorkRequest arwr = new AddRetailerWorkRequest();
        arwr.setNetwork(network);
        o2.getWorkQueue().getWorkRequestList().add(arwr);

        Organization o3 = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.FinanceOrganization);
        UserAccount userAccount4 = o3.getUserAccountDirectory().createUserAccount("kane", "kane", new AccountPAyableRole());
        Employee employee3 = o3.getEmployeeDirectory().createEmployee("kane");
        userAccount4.setEmployee(employee3);

        UserAccount userAccount5 = o3.getUserAccountDirectory().createUserAccount("kane1", "kane1", new AccountReceivableRole());
        Employee employee4 = o3.getEmployeeDirectory().createEmployee("Kane1");
        userAccount5.setEmployee(employee4);

        State state = network.getStateDirectory().createAndAddState("Mah");
        Region r = state.getRegionDirectory().createAndAddRegion("Mumbai");
        Enterprise e1 = r.getVirtualLocalSystem().getEnterpriseDirectory().createAndAddEnterprise("HP", Enterprise.EnterpriseType.RETAILER);
        UserAccount account = e1.getUserAccountDirectory().createUserAccount("hp", "hp", new RetailerRole());
        Employee e2 = e1.getEmployeeDirectory().createEmployee("HP Admin");
        account.setEmployee(e2);
        RetailerEnterprise enterprise1 = (RetailerEnterprise) e1;
        enterprise1.setR(r);
        enterprise1.setS(state);
        enterprise1.setAdminName("HP Admin");
        enterprise1.setBusinessName("Hp");
        enterprise1.setEmialId("hp@.com");
        enterprise1.setZipCode(02120);
        enterprise1.setNetwork(network);

        Organization o4 = e1.getOrganizationDirectory().createOrganization(Organization.Type.ManageInventory);
        UserAccount userAccount6 = o4.getUserAccountDirectory().createUserAccount("ron", "ron", new ManageInventoryRole());
        Employee employee5 = o4.getEmployeeDirectory().createEmployee("HP ADMIN");
        userAccount6.setEmployee(employee5);

        Organization o5 = e1.getOrganizationDirectory().createOrganization(Organization.Type.RetailerOrderProcessing);
        Employee employee6 = o5.getEmployeeDirectory().createEmployee("jasani");
        UserAccount userAccount7 = o5.getUserAccountDirectory().createUserAccount("jasani", "jasani", new RetailerORderPRocessingRole());
        userAccount7.setEmployee(employee6);

        Organization o6 = e1.getOrganizationDirectory().createOrganization(Organization.Type.RetailerFinanceOrganization);
        Employee employee7 = o6.getEmployeeDirectory().createEmployee("ru");
        UserAccount userAccount8 = o6.getUserAccountDirectory().createUserAccount("ru", "ru", new RetailerAccountRecivableRle());
        userAccount8.setEmployee(employee7);

        UserAccount userAccount9 = o6.getUserAccountDirectory().createUserAccount("ru1", "ru1", new RetalerAccountPAyableRole());
        userAccount9.setEmployee(employee7);

        Organization o7 = e1.getOrganizationDirectory().createOrganization(Organization.Type.ShipmentAndPAcking);
        Employee employee8 = o7.getEmployeeDirectory().createEmployee("adi");
        UserAccount account1 = o7.getUserAccountDirectory().createUserAccount("adi", "adi", new ShipmentAndPAckingRole());
        account1.setEmployee(employee8);

        return system;
    }
}
