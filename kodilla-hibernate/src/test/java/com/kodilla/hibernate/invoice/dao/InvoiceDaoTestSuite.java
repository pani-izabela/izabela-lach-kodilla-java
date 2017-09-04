package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("product1");

        Item item1 = new Item(new BigDecimal(20 ), 1, new BigDecimal(20));

        item1.setProduct(product1);
        product1.getItemList().add(item1);

        Invoice invoice1 = new Invoice("111/01/2017");

        item1.setInvoice(invoice1);
        invoice1.getItems().add(item1);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
