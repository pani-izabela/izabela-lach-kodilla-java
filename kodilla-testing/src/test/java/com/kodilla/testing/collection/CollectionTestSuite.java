package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Początek przypadku testowego - Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Koniec przypadku testowego - Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Początek zbioru testów - Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Koniec zbioru testów - Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        allNumbers.add(4);
        allNumbers.add(2);
        allNumbers.add(3);
        allNumbers.add(4);
        allNumbers.add(10);
        allNumbers.add(7);
        allNumbers.add(10);
        allNumbers.add(8);
        allNumbers.add(9);
        allNumbers.add(9);

        System.out.println("Rozmiar listy:" + allNumbers.size());
        System.out.println("Elementy listy przed filtrowaniem: " + allNumbers);

        OddNumbersExterminator onlyEven = new OddNumbersExterminator();
        //When
        ArrayList<Integer> actualList = onlyEven.exterminate(allNumbers);
        System.out.println("Elementy listy po filtrowaniu: " + actualList);

        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(4);
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(10);
        expectedList.add(10);
        expectedList.add(8);

        System.out.println("Rozmiar listy:" + expectedList.size());
        //Then
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        System.out.println("Rozmiar listy:" + allNumbers.size());
        System.out.println("Elementy listy przed filtrowaniem: " + allNumbers);
        OddNumbersExterminator onlyEven = new OddNumbersExterminator();

        //When
        ArrayList<Integer> actualList = onlyEven.exterminate(allNumbers);
        System.out.println("Elementy listy po filtrowaniu: " + actualList);
        ArrayList<Integer> expectedList = new ArrayList<Integer>();

        //Then
        Assert.assertEquals(expectedList.size(), actualList.size());

    }

}
