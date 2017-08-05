package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Producer{
    @Override
    public void process() {
        System.out.println("Zamówienie złożone w sklapie ExtraFoodShop");
    }
}
