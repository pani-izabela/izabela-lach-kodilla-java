package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer{
    private Map<Product, Integer> productsExtraFood;

    public ExtraFoodShop(Map<Product, Integer> productsExtraFood) {
        this.productsExtraFood = productsExtraFood;
    }

    @Override
    public void process(Product product) {
        System.out.println("Zamówienie złożone w sklapie ExtraFoodShop. Dla produktu: " + product);
    }
}
