package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class ExtraFoodShop implements Producer{
    private HashMap<Product, Integer> productsExtraFood;

    @Override
    public void process(Product product) {
        System.out.println("Zamówienie złożone w sklapie ExtraFoodShop");
    }
}
