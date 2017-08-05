package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.challenges.LocalDataTime;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrive(){
        Product product = new Product("Chrupki", 10);
        Client client = new Client("Edward", "Malinowski");
        Producer producer = new Producer("GlutenFreeShop");
        LocalDateTime date = LocalDateTime.of(2017, 8, 3, 11, 50);

        return new OrderRequest(product, client, producer, date);
    }
}
