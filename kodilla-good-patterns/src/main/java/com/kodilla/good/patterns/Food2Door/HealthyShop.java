package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class HealthyShop implements Producer {
    private HashMap<Product, Integer> productsHealthyFood;

    public HealthyShop(HashMap<Product, Integer> productsHealthyFood) {
        this.productsHealthyFood = productsHealthyFood;
    }

    @Override
    public void process(Product product) {
        System.out.println("Zamówienie złożone w sklapie HealthyShop");
    }
}
