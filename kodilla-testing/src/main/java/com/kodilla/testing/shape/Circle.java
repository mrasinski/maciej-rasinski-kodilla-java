package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private double result;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        result = Math.PI * (radius * radius);
        return result;
    }
}
