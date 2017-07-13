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
        Random theGenerator = new Random();
        for (int n = 0; n < 10; n++) {
            allNumbers.add(theGenerator.nextInt(10) + 1);
        }
        OddNumbersExterminator onlyEven = new OddNumbersExterminator();
        System.out.println("Elementy listy przed filtrowaniem: " + allNumbers);
        //When
        ArrayList<Integer> actualList = onlyEven.exterminate(allNumbers);
        System.out.println("Elementy listy po filtrowaniu: " + actualList);
        //Then
        //Powinnam porównać actualList, które są moją wartością aktualną uzyskaną z  etody z wartością oczekiwaną, którą nie wiem co jest?
        //actualList jest typu ArrayList<Integer>, oczekiwana wartość też powinna być tego typu, więc stworzę sobie do niej nową listę expectedList
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        for (Integer xxx : actualList){
        if (xxx % 2 == 0) {
            expectedList.add(xxx);
        }
        }
        //Then
        Assert.assertEquals(expectedList, actualList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> allNumbers = new ArrayList<Integer>();
        OddNumbersExterminator onlyEven = new OddNumbersExterminator();
        System.out.println("Elementy listy przed filtrowaniem: " + allNumbers);
        //When
        ArrayList<Integer> actualList = onlyEven.exterminate(allNumbers);
        System.out.println("Elementy listy po filtrowaniu: " + actualList);
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        for (Integer xxx : actualList){
            if (xxx % 2 == 0) {
                expectedList.add(xxx);
            }
        }
        //Then
        Assert.assertEquals(expectedList, actualList);

    }

}
