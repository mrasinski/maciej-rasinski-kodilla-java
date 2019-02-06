package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<>();

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public void showFigures() {
        for(int i = 0; i < shapeList.size(); i++) {
            System.out.println(shapeList.get(i).getShapeName());
        }
    }
}
