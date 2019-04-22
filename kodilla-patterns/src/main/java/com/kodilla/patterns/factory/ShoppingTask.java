package com.kodilla.patterns.factory;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if (quantity <= 4) {
            isExecuted = true;
            System.out.println("You were able to bought " + whatToBuy);
        } else {
            isExecuted = false;
            System.out.println("Sorry there is no enough " + whatToBuy + " to buy");
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
