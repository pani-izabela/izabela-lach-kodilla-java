package com.kodilla.good.patterns.loty;

import com.kodilla.good.patterns.challenges.LocalDataTime;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ApplicationFlights {
    public static void main(String[] args) {


            Flight flight1 = new Flight("Lot 1", "Warszawa", "Gdańsk", LocalDateTime.of(2017, 8, 8, 5, 10));
            Flight flight2 = new Flight("Lot 2", "Warszawa", "Poznań", LocalDateTime.of(2017, 8, 8, 6, 15));
            Flight flight3 = new Flight("Lot 3", "Kraków", "Poznań", LocalDateTime.of(2017, 8, 8, 7, 40));
            Flight flight4 = new Flight("Lot 4", "Kraków", "Szczecin", LocalDateTime.of(2017, 8, 8, 8, 30));
            Flight flight5 = new Flight("Lot 5", "Szczecin", "Gdańsk", LocalDateTime.of(2017, 8, 8, 12, 0));
            Flight flight6 = new Flight("Lot 6", "Kraków", "Rzeszów", LocalDateTime.of(2017, 8, 8, 15, 5));
            Flight flight7 = new Flight("Lot 7", "Gdańsk", "Wrocław", LocalDateTime.of(2017, 8, 8, 16, 10));
            Flight flight8 = new Flight("Lot 8", "Wrocław", "Szczecin", LocalDateTime.of(2017, 8, 8, 18, 30));
            Flight flight9 = new Flight("Lot 9", "Poznań", "Kraków", LocalDateTime.of(2017, 8, 8, 20, 10));
            Flight flight10 = new Flight("Lot 10", "Warszawa", "Rzeszów", LocalDateTime.of(2017, 8, 8, 23, 20));

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

        System.out.println("Wyświetl wszystkie loty z Warszawy: ");

            flightSet.getFlightSet().stream()
                    .filter(f -> f.getDepartureTown().equals("Warszawa"))
                    .map(f->f.toString())
                    .forEach(System.out::println);

        System.out.println("\nWyświetl wszystkie loty do Gdańska: ");

            flightSet.getFlightSet().stream()
                    .filter(f -> f.getArrivalTown().equals("Gdańsk"))
                    .map(f->f.toString())
                    .forEach(System.out::println);

        System.out.println("\nWyświetl loty z Poznania do Rzeszowa (dozwolona przesiadka): ");

        flightSet.getFlightSet().stream()
                .filter(f -> f.getDepartureTown().equals("Poznań") || f.getArrivalTown().equals("Rzeszów"))
                //.filter(f -> f.getArrivalTown().equals(f.getDepartureTown()))
                .map(f->f.toString())
                .forEach(System.out::println);

    }
}
