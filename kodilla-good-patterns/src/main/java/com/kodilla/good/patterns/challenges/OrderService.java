package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean order(Product product, User user, LocalDateTime dateOrder);
}
