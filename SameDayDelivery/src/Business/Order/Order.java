/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class Order {

    private ArrayList<OrderItem> orderItemList;
    private Date orderdedDate;
    private Date completionDate;
    private String status;
    private float amount;
    public final static String PENDING = "Pending";
    public final static String COMPLETED = "Completed";
    private int id;
    private static int count = 1;

    public Order() {
        id = count;
        count++;
        orderItemList = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public int getId() {
        return id;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Date getOrderdedDate() {
        return orderdedDate;
    }

    public void setOrderdedDate(Date orderdedDate) {
        this.orderdedDate = orderdedDate;
    }

    public OrderItem createAndAddOrderItem() {
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    public void removeOrderITem(OrderItem item){
        orderItemList.remove(item);
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    
}
