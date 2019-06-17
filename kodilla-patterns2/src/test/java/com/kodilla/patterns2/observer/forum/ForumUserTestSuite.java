package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivonneEscobar = new ForumUser("Ivonne Escobar");
        ForumUser jesseePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivonneEscobar);
        javaHelpForum.registerObserver(jesseePinkman);
        javaToolsForum.registerObserver(jesseePinkman);
        //When
        javaHelpForum.addPost("Post 1");
        javaHelpForum.addPost("Post 2");
        javaToolsForum.addPost("Post 3");
        javaHelpForum.addPost("Post 4");
        javaToolsForum.addPost("Post 5");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivonneEscobar.getUpdateCount());
        assertEquals(5, jesseePinkman.getUpdateCount());
    }

}