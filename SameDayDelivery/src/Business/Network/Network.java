/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.State.StateDirectory;

/**
 *
 * @author raunak
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private StateDirectory stateDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        stateDirectory = new StateDirectory();
    }

    public StateDirectory getStateDirectory() {
        return stateDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
