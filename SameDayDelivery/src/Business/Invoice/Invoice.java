/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

/**
 *
 * @author Abhishek
 */
public class Invoice {

    private int id;
    private float amaount;
    private float toBePaidAmount;
    private String status;
    private float commision;
    public final static String PENDING = "Pending";
    public final static String GENERATED = "Generated";
    public final static String PAID = "Paid";
    private float pendingAmount;

    public int getId() {
        return id;
    }

    public float getCommision() {
        return commision;
    }

    public float getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(float pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public void setCommision(float commision) {
        this.commision = commision;
    }

    public float getToBePaidAmount() {
        return toBePaidAmount;
    }

    public void setToBePaidAmount(float toBePaidAmount) {
        this.toBePaidAmount = toBePaidAmount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmaount() {
        return amaount;
    }

    public void setAmaount(float amaount) {
        this.amaount = amaount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
