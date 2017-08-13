package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    public void add(double a, double b){
        Double sum = a + b;
        display.displayValue(sum);
    }

    public void sub(double a, double b){
        Double difference = a - b;
        display.displayValue(difference);
    }

    public void mul(double a, double b){
        Double product = a * b;
        display.displayValue(product);
    }

    public void div (double a, double b){
        Double quotient = a / b;
        display.displayValue(quotient);
    }

}
