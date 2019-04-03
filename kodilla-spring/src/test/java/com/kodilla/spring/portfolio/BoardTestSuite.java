package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = applicationContext.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        toDoList.tasks.add("Task to do");
        inProgressList.tasks.add("Task in progress");
        doneList.tasks.add("Task done");

        Assert.assertTrue(toDoList.tasks.contains("Task to do"));
        Assert.assertTrue(inProgressList.tasks.contains("Task in progress"));
        Assert.assertTrue(doneList.tasks.contains("Task done"));
    }
}
