package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> contninentsList = new ArrayList<Continent>();

    public BigDecimal getPeopleQuantity(){
        return contninentsList.stream()
                //.flatMap()
                //.reduce()
    }
}
