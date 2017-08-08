package com.kodilla.good.patterns.loty;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSet {
    private final Set<Flight> flightSet = new HashSet<Flight>();
    private String city;

    public Set<Flight> getFlightsFrom(String city){
        flightSet.stream()
                .filter(f -> f.getDepartureTown().equals(city))
                .map(f->f.toString())
                .forEach(System.out::println);
        return flightSet;
    }

    public Set<Flight> getFlightsTo(String city){
        flightSet.stream()
                .filter(f -> f.getArrivalTown().equals(city))
                .map(f->f.toString())
                .forEach(System.out::println);
        return flightSet;
    }

    public Set<Flight> getFlights(String from, String to, String by){
        flightSet.stream()
                .filter(f->f.getDepartureTown().equals(from) || f.getArrivalTown().equals(to) || f.getDepartureTown().equals(by))
                .map(f->f.toString())
                .forEach(System.out::println);
        return flightSet;
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }

    public void addFlight(Flight flight) {
        flightSet.add(flight);
    }

    public boolean removeFlight(Flight flight) {
        return flightSet.remove(flight);
    }
}
