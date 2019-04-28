package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");
        Invoice invoice1 = new Invoice("FV23");
        Invoice invoice2 = new Invoice("FV24");
        Item item1 = new Item(product1, new BigDecimal(2345), 23, new BigDecimal(2000));
        Item item2 = new Item(product2, new BigDecimal(123), 3, new BigDecimal(42));
        Item item3 = new Item(product3, new BigDecimal(765), 10, new BigDecimal(1237));

    }
}
