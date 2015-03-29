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
public class AccountPayable {

    private InvoiceDirectory invoiceDirectory;

    public AccountPayable() {
        invoiceDirectory = new InvoiceDirectory();
    }

    public InvoiceDirectory getInvoiceDirectory() {
        return invoiceDirectory;
    }

}
