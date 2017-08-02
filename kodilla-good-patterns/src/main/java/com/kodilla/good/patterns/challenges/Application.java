package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> mapMovies = movieStore.getMovies();
        String titles = mapMovies.entrySet().stream()
                .flatMap(keyPlusValue -> keyPlusValue.getValue().stream())
                //.collect(Collectors.joining(" "," ! "," ! "));

    }
}
