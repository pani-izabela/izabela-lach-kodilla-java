package com.kodilla.testing.shape;

public class Triangle extends Figure implements Shape{
    private int base;
    private int height;

    public Triangle(String nameFigure, int base, int height) {
        super(nameFigure);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public double getField(){
        return (base*height)/2;
    }

    public String getFigureName(){
        return "Triangle";
    }
}
