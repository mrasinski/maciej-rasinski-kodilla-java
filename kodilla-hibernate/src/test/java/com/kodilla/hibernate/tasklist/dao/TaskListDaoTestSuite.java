package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Random description";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("To do task list", DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        String taskListListName = taskList.getListName();
        List<TaskList> task = taskListDao.findByListName(taskListListName);
        Assert.assertEquals(1, task.size());

        //CleanUp
        int id = task.get(0).getId();
        taskListDao.deleteById(id);
    }
}
