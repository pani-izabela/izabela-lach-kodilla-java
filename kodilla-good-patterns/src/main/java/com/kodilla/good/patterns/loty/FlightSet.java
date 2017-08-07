package com.kodilla.good.patterns.loty;

import java.util.HashSet;
import java.util.Set;

public class FlightSet {
    private final Set<Flight> flightSet = new HashSet<Flight>();

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
