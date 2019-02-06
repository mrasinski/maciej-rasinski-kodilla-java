package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double h;
    private double a;
    private double result;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        result = (a * h) / 2;
        return result;
    }
}
