package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class OrderRetriever {
    public Order retrive(){
        Product product = new Product("Chrupki", 10);
        Customer customer = new Customer("Edward", "Malinowski");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        LocalDateTime date = LocalDateTime.of(2017, 8, 3, 11, 50);

        return new Order(product, customer, glutenFreeShop, date);
    }
}
