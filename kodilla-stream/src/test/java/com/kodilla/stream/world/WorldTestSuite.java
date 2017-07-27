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
        World world = new World();
        Continent europe = new Continent();
        Country poland = new Country(new BigDecimal("37950000"));
        Country germany = new Country(new BigDecimal("82670000"));
        Country france = new Country(new BigDecimal("66900000"));

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        world.addContinent(europe);

        Continent asia = new Continent();
        Country russia = new Country(new BigDecimal("142355415"));
        Country china = new Country(new BigDecimal("1373541278"));
        Country india = new Country(new BigDecimal("1266883598"));

        asia.addCountry(russia);
        asia.addCountry(china);
        asia.addCountry(india);

        world.addContinent(asia);

        Continent americaN = new Continent();
        Country usa = new Country(new BigDecimal("308878120"));
        Country kanada = new Country(new BigDecimal("33989040"));
        Country meksyk = new Country(new BigDecimal("107563903"));

        americaN.addCountry(usa);
        americaN.addCountry(kanada);
        americaN.addCountry(meksyk);

        world.addContinent(americaN);

        //When
        BigDecimal totalPeople = BigDecimal.ZERO;
        totalPeople = world.getPeopleQuantity();


        //Then
        BigDecimal expectedQuantityOfPeople = new BigDecimal("3420731354");
        Assert.assertEquals(expectedQuantityOfPeople, totalPeople);
    }
}
