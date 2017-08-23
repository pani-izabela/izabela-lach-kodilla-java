package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task taskShopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Kupowanie", taskShopping.getTaskName());
        Assert.assertFalse(taskShopping.isTaskExecuted());
        Assert.assertEquals("Wykonuję zadanie Kupowanie cement 10.0 kg.", taskShopping.executeTask());

    }

    @Test
    public void testPaintingTask(){

    }

    @Test
    public void testDrivingTask(){

    }
}
