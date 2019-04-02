package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

    @Test
    public void testGetUsername(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");

        ForumUser forumUser = applicationContext.getBean(ForumUser.class);

        String name = forumUser.getUserName();

        Assert.assertEquals("John Smith", name);

    }
}
