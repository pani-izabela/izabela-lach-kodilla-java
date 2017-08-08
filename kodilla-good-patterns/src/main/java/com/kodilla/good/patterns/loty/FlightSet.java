package com.kodilla.good.patterns.loty;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSet {
    private final Set<Flight> flightSet = new HashSet<Flight>();

    public Set<Flight> getFlightsFrom(String city){
        return flightSet.stream()
                .filter(f -> f.getDepartureTown().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> getFlightsTo(String city){
        return flightSet.stream()
                .filter(f -> f.getArrivalTown().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> getFlights(String from, String to){
        Set<Flight> flightsFrom = flightSet.stream()
                .filter(f -> f.getDepartureTown().equals(from))
                .collect(Collectors.toSet());

        Set<Flight> flightsTo = flightSet.stream()
                .filter(f -> f.getArrivalTown().equals(to))
                .collect(Collectors.toSet());

        Flight flightFrom = flightsFrom.stream()
                .filter(f -> {
                    return flightsTo.stream()
                            .filter(t -> f.getArrivalTown().equals(t.getDepartureTown()))
                            .collect(Collectors.toSet()).size() > 0;
                }).findFirst().get();

        Flight flightTo = flightsTo.stream()
                .filter(f -> f.getDepartureTown().equals(flightFrom.getArrivalTown()))
                .findFirst().get();


        HashSet<Flight> returnFlights = new HashSet<>();
        returnFlights.add(flightFrom);
        returnFlights.add(flightTo);

        return returnFlights;
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
