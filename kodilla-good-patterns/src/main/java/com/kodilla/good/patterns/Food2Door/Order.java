package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class Order {
    public Product product;
    public Customer customer;
    public LocalDateTime date;

    public Order(Product product, Customer customer, LocalDateTime date) {
        this.product = product;
        this.customer = customer;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
