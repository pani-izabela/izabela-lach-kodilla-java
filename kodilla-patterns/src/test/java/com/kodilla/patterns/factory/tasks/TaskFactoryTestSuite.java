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
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task taskPainting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Malowanie", taskPainting.getTaskName());
        Assert.assertFalse(taskPainting.isTaskExecuted());
        Assert.assertEquals("Do pomalowania jest ściana na kolor biały", taskPainting.executeTask());

    }

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task taskDriving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Kierowanie", taskDriving.getTaskName());
        Assert.assertFalse(taskDriving.isTaskExecuted());
        Assert.assertEquals("Kurs do Gdańsk z pomocą ciężarówka", taskDriving.executeTask());

    }
}
