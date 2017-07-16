package com.kodilla.testing.shape;

public class Square extends Figure implements Shape{
    private int a;

    public Square(String nameFigure, int a) {
        super(nameFigure);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return ("Figure: " + getFigureName() + ", Field: " + getField());
    }

    public double getField(){
        return (a*a);
    }

    public String getFigureName(){
        return "Square";
    }
}
