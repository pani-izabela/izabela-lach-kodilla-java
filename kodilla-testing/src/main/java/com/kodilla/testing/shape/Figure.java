package com.kodilla.testing.shape;


abstract class Figure implements Shape{
    String nameFigure;

    public Figure(String nameFigure) {
        this.nameFigure = nameFigure;
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
