/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class InvoiceDirectory {

    private ArrayList<Invoice> invoiceList;

    public InvoiceDirectory() {
        invoiceList = new ArrayList<>();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public Invoice createAndAddInvoice() {
        Invoice invoice = new Invoice();
        invoiceList.add(invoice);
        return invoice;
    }

}
