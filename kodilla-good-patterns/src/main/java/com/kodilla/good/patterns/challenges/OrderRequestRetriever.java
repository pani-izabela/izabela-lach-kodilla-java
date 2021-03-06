package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrive() {
        Product product = new Product("Szczotka");
        User user = new User("Jan", "Kowalski");
        LocalDateTime orderDate = LocalDateTime.of(2017, 8, 3, 23, 50);

        return new OrderRequest(product, user, orderDate);
    }
}
