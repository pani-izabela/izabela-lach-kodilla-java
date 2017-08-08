package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {
    public Order retrive(){

        Product product1 = new Product("Chrupki", 2);

        Customer customer = new Customer("Edward", "Malinowski");

        LocalDateTime date = LocalDateTime.of(2017, 8, 3, 11, 50);

        return new Order(product1, customer, date);
    }
}