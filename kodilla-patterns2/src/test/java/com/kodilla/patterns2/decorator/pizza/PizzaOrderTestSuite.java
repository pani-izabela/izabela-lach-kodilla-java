package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new MeatPizzaOrderDecorator(theOrder);
        theOrder = new VegetablesPizzaOrderDecorator(theOrder);
        theOrder = new VegetablesPizzaOrderDecorator(theOrder);
        theOrder = new OtherPizzaOrderDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(32), cost);

    }

    @Test
    public void testPizzaGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesePizzaOrderDecorator(theOrder);
        theOrder = new MeatPizzaOrderDecorator(theOrder);
        theOrder = new VegetablesPizzaOrderDecorator(theOrder);
        theOrder = new VegetablesPizzaOrderDecorator(theOrder);
        theOrder = new OtherPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza: ciasto, sos pomidorowy, ser + additional cheese + meat + vegetables + vegetables + other ", description);

    }
}
