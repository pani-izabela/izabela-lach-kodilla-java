package com.kodilla.good.patterns.loty;

import com.kodilla.good.patterns.challenges.LocalDataTime;

import java.time.LocalDateTime;

public class ApplicationFlights {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Lot 1", "Warszawa", "Gdańsk", LocalDateTime.of(2017, 8, 8, 5, 10));
        Flight flight2 = new Flight("Lot 2", "Warszawa", "Poznań");
        Flight flight3 = new Flight("Lot 3", "Kraków", "Poznań");
        Flight flight4 = new Flight("Lot 4", "Kraków", "Szczecin");
        Flight flight5 = new Flight("Lot 5", "Szczecin", "Gdańsk");
        Flight flight6 = new Flight("Lot 6", "Kraków", "Rzeszów");
        Flight flight7 = new Flight("Lot 7", "Gdańsk", "Wrocław");
        Flight flight8 = new Flight("Lot 8", "Wrocław", "Szczecin");
        Flight flight9 = new Flight("Lot 9", "Poznań", "Kraków");
        Flight flight10 = new Flight("Lot 10", "Warszawa", "Rzeszów");

        FlightSet flightSet = new FlightSet();
        flightSet.addFlight(flight1);
        flightSet.addFlight(flight2);
        flightSet.addFlight(flight3);
        flightSet.addFlight(flight4);
        flightSet.addFlight(flight5);
        flightSet.addFlight(flight6);
        flightSet.addFlight(flight7);
        flightSet.addFlight(flight8);
        flightSet.addFlight(flight9);
        flightSet.addFlight(flight10);


    }
}
