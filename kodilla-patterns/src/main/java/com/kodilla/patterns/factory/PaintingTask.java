package com.kodilla.patterns.factory;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (color.equals("red")) {
            isExecuted = false;
            System.out.println("Sorry we don't have red paint");
        } else {
            isExecuted = true;
            System.out.println("You painted " + whatToPaint + " with " + color + " paint");
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
