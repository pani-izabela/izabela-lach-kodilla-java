package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Początek testów.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Koniec testów.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Nr testu: " + testCounter);
    }
}
