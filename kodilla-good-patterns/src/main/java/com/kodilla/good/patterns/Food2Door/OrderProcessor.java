package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {
    private Producer producer;

    public OrderProcessor(Producer producer) {
        this.producer = producer;
    }

    public Order process(Order order){
        producer.process(order.getProduct());
        order.setProcessed(true);

        return order;
    }
}
