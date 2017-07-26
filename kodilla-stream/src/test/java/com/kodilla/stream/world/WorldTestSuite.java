package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World europe = new World();
        europe.addContinent(new Continent(new Country("987654321987654321")));
        europe.addContinent(new Continent(new Country("22222222222222222222")));
        europe.addContinent(new Continent(new Country("333333333333333333333333")));

        World asia = new World();
        asia.addContinent(new Continent(new Country()));

        World americaN = new World();
        americaN.addContinent(new Continent(new Country()));


        //When

        //Then
    }
}
