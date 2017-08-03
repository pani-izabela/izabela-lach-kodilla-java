package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public boolean order(final Product nameProduct, final LocalDataTime dateOrder, final User user){
        System.out.println("Użytkownik: " + user.getName() + user.getSurname() + " dnia: " + dateOrder.toString() + " zamówił: " + nameProduct.getNameProduct());
        return true;
    }
}
