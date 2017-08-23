package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Kupowanie", "cement", 10);
            case PAINTING:
                return new PaintingTask("Malowanie", "biały", "ściana");
            case DRIVING:
                return new DrivingTask("Kierowanie", "Gdańsk", "ciężarówka");
            default:
                return null;
        }
    }
}
