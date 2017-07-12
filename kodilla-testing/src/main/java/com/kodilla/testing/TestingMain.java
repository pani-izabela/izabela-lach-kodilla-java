package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Test dla klasy calculator
        Calculator calculator = new Calculator();
        int difference = calculator.subtract(8, 4);
        if (difference == 4){
            System.out.println("Odejmowanie działa! OK");
        } else {
            System.out.println("Odejmowanie nie działa! Error");
        }

        int total = calculator.add(8, 4);
        if (total == 12){
            System.out.println("Dodawanie działa! OK");
        } else {
            System.out.println("Dodawanie nie działa! Error");
        }

    }
}