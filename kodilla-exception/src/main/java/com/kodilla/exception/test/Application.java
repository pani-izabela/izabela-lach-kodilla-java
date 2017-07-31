package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {

        LogicFlight logicFlight = new LogicFlight();
        Flight flight1 = new Flight("Lotnisko Chopina w Warszawie");
        //Flight flight1 = new Flight("Lotnisko w Radomiu");

        try{
            logicFlight.findFilght(flight1);
        } catch (RouteNotFoundException e){
            System.out.println("Takiego lotniska nie ma na mapie!");
        } finally {
            System.out.println("Koniec!");
        }

    }
}
