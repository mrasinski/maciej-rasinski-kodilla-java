package com.kodilla.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertTrue(shoppingTask.isTaskExecuted());
        Assert.assertEquals("The shopping task", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();
        //Then
        Assert.assertTrue(drivingTask.isTaskExecuted());
        Assert.assertEquals("The driving task", drivingTask.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();
        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
        Assert.assertEquals("The painting task", paintingTask.getTaskName());
    }
}
