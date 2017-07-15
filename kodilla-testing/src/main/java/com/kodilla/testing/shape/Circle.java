package com.kodilla.testing.shape;

import java.lang.*;

public class Circle extends Figure implements Shape{
    private int r;

    public Circle(String nameFigure, int r) {
        super(nameFigure);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getField(){
        return (Math.PI*r*r);
    }

    public String getFigureName(){
        return "Circle";
    }
}
