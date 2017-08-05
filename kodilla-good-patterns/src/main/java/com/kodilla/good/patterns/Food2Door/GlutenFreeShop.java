package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;

public class GlutenFreeShop implements Producer{
    private HashMap<Product, Integer> productGlutenFree;

    @Override
    public void process(Product product) {
        System.out.println("Zamówienie złożone w sklapie GlutenFreeShop");
    }
}
