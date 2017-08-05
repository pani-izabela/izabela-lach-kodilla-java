package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.challenges.LocalDataTime;

import java.time.LocalDateTime;

public class OrderRequest {
    public Product product;
    public Client client;
    public Producer producer;
    public LocalDataTime date;

    public OrderRequest(Product product, Client client, Producer producer, LocalDateTime date) {
        this.product = product;
        this.client = client;
        this.producer = producer;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public Client getClient() {
        return client;
    }

    public Producer getProducer() {
        return producer;
    }

    public LocalDataTime getDate() {
        return date;
    }
}
