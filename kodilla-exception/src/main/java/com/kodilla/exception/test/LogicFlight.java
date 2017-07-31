package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LogicFlight {
    private Map<String, Boolean> flightsMap = new HashMap<String, Boolean>();

    public LogicFlight(Map<String, Boolean> flightsMap) {
        this.flightsMap = flightsMap;
    }

    public Boolean findFilght(Flight flight) throws RouteNotFoundException {
        Boolean flightMap = this.flightsMap.get(flight.getDepartureAirport());
        if (flightMap == null) {
            throw new RouteNotFoundException();
        }
        else {
            System.out.println("Można lecieć na to lotnisko.");
        }
        return flightMap;
    }
}

