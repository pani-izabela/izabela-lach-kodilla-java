package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.challenges.LocalDataTime;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producer{
    private Map<Product, Integer> productGlutenFree;

    public GlutenFreeShop(Map<Product, Integer> productGlutenFree) {
        this.productGlutenFree = productGlutenFree;
    }

    @Override
    public void process(Product product) {

        System.out.println("Zamówienie złożone w sklapie GlutenFreeShop. Dla produktu: " + product);

    }
}
