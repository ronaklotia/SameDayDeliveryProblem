/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Inventory.Product;
import Business.Invoice.Invoice;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Avi
 */
public class OrderItem {

    private int quantity;
    private float totalPrice;
    private Product product;
    private float priceAfterShipping;
    private String Status;
    private float ShippingCharge;
    private Invoice invoice;
    private ArrayList<TrackOrder> orderList;
    public final static String PENDING_STATUS = "Pending";
    public final static String DELIVERED = "Delivered";
    public final static String INPROCESS = "Inprocess";
    public final static String DELIVERED_LATE = "Delivered Late";
    private Date orderItemDate;
    private Date completionOrderDate;

    private ReturnOrderDetails returnOrderDetails;
    private boolean eligible;
    
    private boolean forpenalty;
    private int trackingID;
    private boolean ratingComplted;

    public OrderItem() {
        this.forpenalty = false;
        this.ratingComplted = false;
        this.eligible = true;
        product = new Product();
        orderList = new ArrayList<>();
       
        returnOrderDetails = new ReturnOrderDetails();
        
    }

    public boolean isRatingComplted() {
        return ratingComplted;
    }

    public float getPriceAfterShipping() {
        return priceAfterShipping;
    }

    public boolean isForpenalty() {
        return forpenalty;
    }

    public void setForpenalty(boolean forpenalty) {
        this.forpenalty = forpenalty;
    }

    public int getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(int trackingID) {
        this.trackingID = trackingID;
    }

    public void setPriceAfterShipping(float priceAfterShipping) {
        this.priceAfterShipping = priceAfterShipping;
    }

    public void setRatingComplted(boolean ratingComplted) {
        this.ratingComplted = ratingComplted;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public boolean isEligible() {
        return eligible;
    }

    public float getShippingCharge() {
        return ShippingCharge;
    }

    public void setShippingCharge(float ShippingCharge) {
        this.ShippingCharge = ShippingCharge;
    }

    public ReturnOrderDetails getReturnOrderDetails() {
        return returnOrderDetails;
    }

    public void setReturnOrderDetails(ReturnOrderDetails returnOrderDetails) {
        this.returnOrderDetails = returnOrderDetails;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

  

    public ArrayList<TrackOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<TrackOrder> orderList) {
        this.orderList = orderList;
    }

    public Date getCompletionOrderDate() {
        return completionOrderDate;
    }

    public void setCompletionOrderDate(Date completionOrderDate) {
        this.completionOrderDate = completionOrderDate;
    }

    public Date getOrderItemDate() {
        return orderItemDate;
    }

    public void setOrderItemDate(Date orderItemDate) {
        this.orderItemDate = orderItemDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TrackOrder createAndAddTrackOrder() {
        TrackOrder order = new TrackOrder();
        orderList.add(order);
        return order;
    }

    @Override
    public String toString() {
        return product.getName();
    }
    
    
}
