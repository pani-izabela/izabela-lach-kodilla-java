package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(Product product, User user, LocalDateTime dateOrder) {
        System.out.println("Produkt o nazwie: " + product.getNameProduct() + " " + ", zamówił: " + user.getName() + " " + user.getSurname()
        + " - Data/godzina zamówienia: " + dateOrder.toString());
        return true;
    }
}
