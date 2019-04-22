package com.kodilla.patterns.factory;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "ShoppingTask";
    public static final String DRIVING_TASK = "DrivingTask";
    public static final String PAINTING_TASK = "PaintingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("The shopping task", "lemon", 2);
            case DRIVING_TASK:
                return new DrivingTask("The driving task", "Warsaw", "foot");
            case PAINTING_TASK:
                return new PaintingTask("The painting task", "black", "Kitchen");
            default:
                return null;
        }

    }
}
