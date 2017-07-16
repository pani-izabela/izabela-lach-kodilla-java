package com.kodilla.testing.shape;

import org.junit.*;

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

    @Test
    public void testAddCircle(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 10);
        //When
        shapeCollector.addFigure(circle);
        //Then
        String expectedString = ("Figure: " + circle.getFigureName() + ", Field: " + circle.getField());
        Assert.assertEquals(expectedString, shapeCollector.showFigures());
    }

    @Test
    public void testAddSquare(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Square", 5);
        //When
        shapeCollector.addFigure(square);
        //Then
        String expectedString = ("Figure: " + square.getFigureName() + ", Field: " + square.getField());
        Assert.assertEquals(expectedString, shapeCollector.showFigures());
    }

    @Test
    public void testAddTriangle(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 4, 3);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        String expectedString = ("Figure: " + triangle.getFigureName() + ", Field: " + triangle.getField());
        Assert.assertEquals(expectedString, shapeCollector.showFigures());
    }

    @Test
    public void removeFigureCircleNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 10);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void removeFigureSquareNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("Square", 4);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void removeFigureTriangleNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 4, 3);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 4, 3);
        shapeCollector.addFigure(triangle);

        //When
        boolean result = shapeCollector.removeFigure(triangle);

        //Then
        Assert.assertTrue(result);
    }


}
