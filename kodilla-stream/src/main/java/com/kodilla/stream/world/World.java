package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> contninentsList = new ArrayList<Continent>();


    public void addContinent(Continent continent){
        contninentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return contninentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country :: getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
