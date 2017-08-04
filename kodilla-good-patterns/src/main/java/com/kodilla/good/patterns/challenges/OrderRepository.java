package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;

public interface OrderRepository {
    public void createOrder(Product product, User user, LocalDateTime dateOrder);
}
