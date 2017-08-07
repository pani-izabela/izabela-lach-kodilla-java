package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {
    public Order retrive(){
        Product product1 = new Product("Chrupki", 10);
        Product product2 = new Product("Ciastka", 10);
        Product product3 = new Product("Makaron", 10);
        Product product4 = new Product("Wino", 30);
        Product product5 = new Product("Miód", 20);
        Product product6 = new Product("Kawior", 30);
        Product product7 = new Product("Marchew", 50);
        Product product8 = new Product("Kalafior", 50);
        Product product9 = new Product("Por", 50);

        Customer customer = new Customer("Edward", "Malinowski");

        Map<Product, Integer> productGlutenFree = new HashMap<Product, Integer>();
        productGlutenFree.put(product1, 4);
        productGlutenFree.put(product2, 2);
        productGlutenFree.put(product3, 1);

        Map<Product, Integer> productsExtraFood = new HashMap<Product, Integer>();
        productsExtraFood.put(product4, 1);
        productsExtraFood.put(product5, 2);
        productsExtraFood.put(product6, 2);

        Map<Product, Integer> productsHealthyFood = new HashMap<Product, Integer>();
        productsHealthyFood.put(product7, 5);
        productsHealthyFood.put(product8, 2);
        productsHealthyFood.put(product9, 3);

        LocalDateTime date = LocalDateTime.of(2017, 8, 3, 11, 50);

        return new Order(product1, customer, date);
    }
}
