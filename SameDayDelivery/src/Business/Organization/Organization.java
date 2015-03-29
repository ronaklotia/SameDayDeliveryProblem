/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.State.StateDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private StateDirectory stateDirectory;

    public enum Type {

       Admin("Admin Organization"),
       CustomerRelationShip("Customer Relation Organization"),
       OrderProcessing(" Order Processing Organiztion"),
       RetailerOrderProcessing("Retailer Order Processing Organization"),
       FinanceOrganization(" Finance Organization"),
       RetailerFinanceOrganization("Retailer Finance Organization"),
       ManageRetailer("Manage REtailer organization"),
       ManageInventory("Manage Inventory Organization"),
       ShipmentAndPAcking("ShipmentAndPAckingOrganization");
       
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        stateDirectory = new StateDirectory();

        organizationID = counter;
        ++counter;
    }

    public StateDirectory getStateDirectory() {
        return stateDirectory;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccount authenticateUser(String username, String password) {
        return this.userAccountDirectory.authenticateUser(username, password);
    }

    @Override
    public String toString() {
        return name;
    }
}
