package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class HealthyShop implements Producer {
    private HashMap<Product, Integer> productsHealthyFood;

    @Override
    public void process(Product product) {
        System.out.println("Zamówienie złożone w sklapie HealthyShop");
    }
}
