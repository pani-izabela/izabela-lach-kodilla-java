package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setRoll("Bułka z sezamem")
                .setBurgers(2)
                .setSauce("1000 wysp")
                .setIngredient("Sałata")
                .setIngredient("Cebula")
                .setIngredient("Ogórek")
                .setIngredient("Ser")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);

    }
}
