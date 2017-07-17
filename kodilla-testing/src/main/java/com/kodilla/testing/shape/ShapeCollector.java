package com.kodilla.testing.shape;

import java.util.HashSet;

public class ShapeCollector {
    HashSet<Figure> figures = new HashSet<Figure>();

    public void addFigure(Figure figure){
        figures.add(figure);
    }

    public boolean removeFigure(Figure figure){
        boolean result = false;
        if (figures.contains(figure)){
            figures.remove(figure);
            result = true;
        }
        return result;
    }

    public String showFigures(){
        String figurePresentation = null;
        for (Figure figure : figures) {
            figurePresentation = "Figure: " + figure.getFigureName() + ", Field: " + figure.getField();
        }
        return figurePresentation;
    }
}
