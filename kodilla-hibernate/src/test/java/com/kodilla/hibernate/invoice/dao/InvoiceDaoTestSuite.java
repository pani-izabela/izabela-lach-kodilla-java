package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("herbata");
        Product product2 = new Product("kawa");
        Product product3 = new Product("masło");
        Product product4 = new Product("mleko");

        Item item1 = new Item(product1, new BigDecimal(20 ), 1, new BigDecimal(20));
        Item item2 = new Item(product3, new BigDecimal(35 ), 2, new BigDecimal(70));
        Item item3 = new Item(product4, new BigDecimal(3 ), 4, new BigDecimal(12));
        Item item4 = new Item(product1, new BigDecimal(23 ), 1, new BigDecimal(23));
        Item item5 = new Item(product3, new BigDecimal(5 ), 3, new BigDecimal(15));
        Item item6 = new Item(product2, new BigDecimal(15 ), 1, new BigDecimal(15));

        Invoice invoice1 = new Invoice("111/01/2017");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item6);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item6.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //invoiceDao.delete(id);
    }
}
