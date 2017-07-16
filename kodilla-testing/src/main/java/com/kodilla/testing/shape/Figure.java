package com.kodilla.testing.shape;


abstract class Figure implements Shape{
    private String nameFigure;

    public Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    @Override
    public String toString() {
        return ("Figure: " + getFigureName() + ", Field: " + getField());
    }

    public String getNameFigure() {
        return nameFigure;
    }

    @Override
    public String getFigureName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }
}
