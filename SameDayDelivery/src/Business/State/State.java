/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Region.RegionDirectory;

/**
 *
 * @author Avi
 */
public class State {
    
    private String stateName;
    private float tax;
    private RegionDirectory regionDirectory;

    public State() {
        regionDirectory = new RegionDirectory();
    }

    
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public RegionDirectory getRegionDirectory() {
        return regionDirectory;
    }

    public void setRegionDirectory(RegionDirectory regionDirectory) {
        this.regionDirectory = regionDirectory;
    }
    
    @Override
    public String toString(){
        return stateName;
    }
    
    
}
