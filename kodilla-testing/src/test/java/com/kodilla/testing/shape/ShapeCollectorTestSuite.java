package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int counter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        counter++;
        System.out.println("Preparing to execute test #" + counter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle(2.4);
        ShapeCollector sC = new ShapeCollector();
        //When
        sC.addFigure(shape);
        //Then
        Assert.assertEquals(shape.getShapeName(), sC.getShapeList().get(0).getShapeName());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Square(2.0);
        ShapeCollector sC = new ShapeCollector();
        sC.addFigure(shape);
        //When
        sC.removeFigure(shape);
        //Then
        Assert.assertEquals(0, sC.getShapeList().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Triangle(2.4, 4.5);
        ShapeCollector sC = new ShapeCollector();
        sC.addFigure(shape);
        //When
        Shape result = sC.getFigure(0);
        //Then
        Assert.assertEquals(shape, result);
    }
}
