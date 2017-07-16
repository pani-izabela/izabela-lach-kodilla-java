package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Figure;
import com.kodilla.testing.shape.Circle;
import java.util.HashSet;

public class ShapeCollector {
    HashSet<Figure> figures = new HashSet<Figure>();

    public void addFigure(Figure figure){
        //Circle circle1 = new Circle("koło", 10);
        //figures.add(circle1);
    }

    public boolean removeFigure(Figure figure){
        return true;
    }

    public String showFigures(){
        //String ggg = circle.toString();
        return null;
    }
}
