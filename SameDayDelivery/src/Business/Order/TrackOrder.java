/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class TrackOrder {

    private String location;
    private String activity;
    private Date activityDate;

    private String details;
    private Date estimatedDeliveryDate;
    private String estimateDeliverTime;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEstimateDeliverTime() {
        return estimateDeliverTime;
    }

    public void setEstimateDeliverTime(String estimateDeliverTime) {
        this.estimateDeliverTime = estimateDeliverTime;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return String.valueOf(activityDate);
    }
    
    

}
