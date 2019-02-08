package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int counter = 0;

    @Before
    public void beforeEveryTest() {
        counter++;
        System.out.println("Start test: " + counter);
    }

    @After
    public void afterTest() {
        System.out.println("End test");
    }

    @Test
    public void testCalculateAdvStatisticsZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            userNameList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
            Assert.assertEquals(0, forumStatistics.getAvgPostPerUser(), 0.1);
            Assert.assertEquals(0, forumStatistics.getAvgCommtPerPost(), 0.1);
            Assert.assertEquals(5, forumStatistics.getAvgCommtPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsManyPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            userNameList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(15);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(50, forumStatistics.getAvgPostPerUser(), 0.1);
        Assert.assertEquals(0, forumStatistics.getAvgCommtPerPost(), 0.1);
        Assert.assertEquals(0.8, forumStatistics.getAvgCommtPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            userNameList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, forumStatistics.getAvgPostPerUser(), 0.1);
        Assert.assertEquals(100, forumStatistics.getAvgCommtPerPost(), 0.1);
        Assert.assertEquals(50, forumStatistics.getAvgCommtPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsMorePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            userNameList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(300);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(25, forumStatistics.getAvgPostPerUser(), 0.1);
        Assert.assertEquals(0.6, forumStatistics.getAvgCommtPerPost(), 0.1);
        Assert.assertEquals(15, forumStatistics.getAvgCommtPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsMoreComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            userNameList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(300);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(15, forumStatistics.getAvgPostPerUser(), 0.1);
        Assert.assertEquals(1.7, forumStatistics.getAvgCommtPerPost(), 0.1);
        Assert.assertEquals(25, forumStatistics.getAvgCommtPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(300);
        when(statisticsMock.commentsCount()).thenReturn(600);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getAvgPostPerUser(), 0.1);
        Assert.assertEquals(2, forumStatistics.getAvgCommtPerPost(), 0.1);
        Assert.assertEquals(0, forumStatistics.getAvgCommtPerUser(), 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsManyUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            userNameList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(300);
        when(statisticsMock.commentsCount()).thenReturn(400);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(3, forumStatistics.getAvgPostPerUser(), 0.1);
        Assert.assertEquals(1.3, forumStatistics.getAvgCommtPerPost(), 0.1);
        Assert.assertEquals(4, forumStatistics.getAvgCommtPerUser(), 0.1);
    }
}
