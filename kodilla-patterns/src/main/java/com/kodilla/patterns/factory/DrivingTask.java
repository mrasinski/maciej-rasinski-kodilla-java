package com.kodilla.patterns.factory;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (using.equals("foot") || using.equals("bike")) {
            isExecuted = true;
            System.out.println("Thanks for using " + using + " you will be at " + where + " at no time");
        } else {
            isExecuted = false;
            System.out.println("We don't like transportation other than by foot or bike, you aren't going anywhere");
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
