/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class MasterOrderList {

    private ArrayList<Order> masterOrderList;

    public MasterOrderList() {
        masterOrderList = new ArrayList<>();
    }

    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }

}
