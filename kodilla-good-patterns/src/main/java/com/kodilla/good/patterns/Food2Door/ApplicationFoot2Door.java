package com.kodilla.good.patterns.Food2Door;

public class ApplicationFoot2Door {
    public static void main(String[] args){
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new GlutenFreeShop());
        orderProcessor.process(order);
    }
}
