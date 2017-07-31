package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<String, Boolean> flightsMap = new HashMap<String, Boolean>();
        flightsMap.put("Lotnisko Chopina w Warszawie", true);
        flightsMap.put("Kraków Airport im. Jana Pawła II", true);
        flightsMap.put("Port lotniczy Gdańsk im. Lecha Wałęsy", false);
        flightsMap.put("Międzynarodowy Port Lotniczy Katowice w Pyrzowicach", false);

        LogicFlight logicFlight = new LogicFlight(flightsMap);
        Flight flight1 = new Flight("Lotnisko Chopina w Warszawie");

        try{
            logicFlight.findFilght(flight1);
        } catch (RouteNotFoundException e){
            System.out.println("Takiego lotniska nie ma na mapie!");
        } finally {
            System.out.println("Koniec wyszukiwania!");
        }

    }
}
