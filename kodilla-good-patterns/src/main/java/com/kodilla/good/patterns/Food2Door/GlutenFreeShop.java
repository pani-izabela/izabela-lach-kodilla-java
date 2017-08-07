package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.challenges.LocalDataTime;

import java.util.HashMap;

public class GlutenFreeShop implements Producer{
    private HashMap<Product, Integer> productGlutenFree;

    public GlutenFreeShop(HashMap<Product, Integer> productGlutenFree) {
        this.productGlutenFree = productGlutenFree;
    }

    @Override
    public void process(Product product) {

        System.out.println("Zamówienie złożone w sklapie GlutenFreeShop.");

    }
}
