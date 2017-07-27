package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] table = {5, 14, 10, 3, 100, 23, 56, 75, 2, 98, 22, 11, 8, 73, 35, 27, 99, 31, 20, 50};

        //When
        double actualValue = ArrayOperations.getAverage(table);

        //Then
        Assert.assertEquals(38.1, actualValue, 0.001);

    }
}
