/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Region;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Avi
 */
public class RegionDirectory {

    private ArrayList<Region> regionList;

    public RegionDirectory() {
        regionList = new ArrayList<>();

    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public Region createAndAddRegion(String name) {
        Region region = new Region();
        region.setRegionName(name);
        regionList.add(region);
        return region;
    }
}
