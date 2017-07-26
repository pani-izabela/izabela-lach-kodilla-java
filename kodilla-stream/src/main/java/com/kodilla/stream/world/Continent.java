package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<Country> countriesList = new ArrayList<Country>();

    public Continent(List<Country> countriesList) {
        this.countriesList = countriesList;
    }

    public void addCountry(Country country){
        countriesList.add(country);
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}
