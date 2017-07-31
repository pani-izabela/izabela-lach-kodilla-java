package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LogicFlight {
    public String findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<String, Boolean>();
        flightsMap.put("Lotnisko Chopina w Warszawie", true);
        flightsMap.put("Kraków Airport im. Jana Pawła II", true);
        flightsMap.put("Port lotniczy Gdańsk im. Lecha Wałęsy", false);
        flightsMap.put("Międzynarodowy Port Lotniczy Katowice w Pyrzowicach", false);

        /*for (Map.Entry<String, Boolean> airports : flightsMap.entrySet()) {
            if (airports.getKey().equals(flight.getDepartureAirport())) {
                System.out.println(airports.getKey() + " prawda");
            } else {
                System.out.println(airports.getKey() + " fałsz");
            }
        }*/
        for (Map.Entry<String, Boolean> airports : flightsMap.entrySet()) {
            if (airports.getKey().equals(flight.getDepartureAirport())== false) {
                throw new RouteNotFoundException();
            }
        }

        /*if (flightsMap.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }*/
        return "Można lecieć na to lotnikso!";

    }
}
