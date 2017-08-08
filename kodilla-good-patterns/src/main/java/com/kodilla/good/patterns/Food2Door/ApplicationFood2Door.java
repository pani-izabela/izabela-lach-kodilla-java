package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ApplicationFood2Door {
    public static void main(String[] args){
        Product product1 = new Product("Chrupki", 10);
        Product product2 = new Product("Ciastka", 10);
        Product product3 = new Product("Makaron", 10);

        Map<Product, Integer> productGlutenFree = new HashMap<Product, Integer>();
        productGlutenFree.put(product1, 4);
        productGlutenFree.put(product2, 2);
        productGlutenFree.put(product3, 1);

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFreeShop(productGlutenFree));
        orderProcessor.process(order);
    }
}
