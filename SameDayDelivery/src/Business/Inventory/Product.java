/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.Enterprise.RetailerEnterprise;

/**
 *
 * @author Abhishek
 */
public class Product {

    private String name;
    private int upcCode;
    private int Quantity;
    private float price;
    private RetailerEnterprise enterprise;
    private boolean isEligble;
    private String description;
    private String features;
    private float shippingCharge;
    private int tempNewQuantity;

    public int getTempNewQuantity() {
        return tempNewQuantity;
    }

    public void setTempNewQuantity(int tempNewQuantity) {
        this.tempNewQuantity = tempNewQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getShippingCharge() {
        return shippingCharge;
    }

    public void setShippingCharge(float shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public int getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(int upcCode) {
        this.upcCode = upcCode;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public RetailerEnterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(RetailerEnterprise enterprise) {
        this.enterprise = enterprise;
    }

    public boolean isIsEligble() {
        return isEligble;
    }

    public void setIsEligble(boolean isEligble) {
        this.isEligble = isEligble;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return name;
    }

}
