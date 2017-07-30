package com.kodilla.exception.challenge;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println("Wynik dzielenia: " + result);
        }catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0!");
        }finally{
            System.out.println("Dzielenie wykonane");
        }

        //System.out.println(result);

    }
}
