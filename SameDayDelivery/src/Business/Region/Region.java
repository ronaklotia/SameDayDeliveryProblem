/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Region;

import Business.Customer.CustomerDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.RetailerEnterprise;

/**
 *
 * @author Avi
 */
public class Region {

    private String regionName;
    private VirtualLocalSystem virtualLocalSystem;

    public Region() {
        virtualLocalSystem = new VirtualLocalSystem();
    }

    public VirtualLocalSystem getVirtualLocalSystem() {
        return virtualLocalSystem;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return regionName;
    }
}
