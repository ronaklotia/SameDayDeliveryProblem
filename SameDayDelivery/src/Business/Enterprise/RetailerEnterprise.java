/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import Business.Region.Region;
import Business.Role.RetailerRole;
import Business.Role.Role;
import Business.State.State;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class RetailerEnterprise extends Enterprise {

    private String businessName;
    private String adminName;
    private State s;
    private Region r;
    private String emialId;
    private Network network;
    private int zipCode;
    private float rating;

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public RetailerEnterprise(String name) {
        super(name, EnterpriseType.RETAILER);
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public State getS() {
        return s;
    }

    public void setS(State s) {
        this.s = s;
    }

    public Region getR() {
        return r;
    }

    public void setR(Region r) {
        this.r = r;
    }

    public String getEmialId() {
        return emialId;
    }

    public void setEmialId(String emialId) {
        this.emialId = emialId;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new RetailerRole());
        return roleList;
    }

}
