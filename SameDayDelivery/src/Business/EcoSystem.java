/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;
    private NetworkDirectory networkDirectory;

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    public Network getnetworkfromname(String name) {
        for (Network n : networkDirectory.getNetworkList()) {
            if (n.getName().equals(name)) {
                return n;

            }
        }
        return null;
    }
    ArrayList<UserAccount> useraccountlist = new ArrayList<>();

    public boolean adduseraccount(String u) {
        for (UserAccount u1 : useraccountlist) {
            if (u1.getUsername().equals(u)) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<UserAccount> getUseraccountlist() {
        return useraccountlist;
    }

    public void setUseraccountlist(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }

    private EcoSystem() {
        super(null);
        this.networkDirectory = new NetworkDirectory();

    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        SystemAdminRole role = new SystemAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }
}
