package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer {
    private Map<Product, Integer> productsHealthyFood;

    public HealthyShop(Map<Product, Integer> productsHealthyFood) {
        this.productsHealthyFood = productsHealthyFood;
    }

    @Override
    public void process(Product product) {
        System.out.println("Zamówienie złożone w sklapie HealthyShop. Dla produktu: " + product);
    }
}
