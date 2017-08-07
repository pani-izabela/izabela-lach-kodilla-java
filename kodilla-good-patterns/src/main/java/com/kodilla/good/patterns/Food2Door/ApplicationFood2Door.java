package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class ApplicationFood2Door {
    public static void main(String[] args){
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFreeShop(new HashMap<>()));
        orderProcessor.process(order);
    }
}
