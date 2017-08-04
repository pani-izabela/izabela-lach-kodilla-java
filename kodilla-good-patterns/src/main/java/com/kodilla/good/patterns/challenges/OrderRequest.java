package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    public Product product;
    public User user;
    public LocalDateTime date;

    public OrderRequest(Product product, User user, LocalDateTime date) {
        this.product = product;
        this.user = user;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
