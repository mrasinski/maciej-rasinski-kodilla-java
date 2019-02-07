package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Before
    public void beforeTest() {
        System.out.println("Start test");
    }

    @After
    public void afterTest() {
        System.out.println("End test");
    }

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> userNameList = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            userNameList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNameList);
        when(statisticsMock.postsCount()).thenReturn(12300);
        when(statisticsMock.commentsCount()).thenReturn(10001);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(12.3, forumStatistics.getAvgPostPerUser(), 0.1);
        Assert.assertEquals(0.8, forumStatistics.getAvgCommtPerPost(), 0.1);
        Assert.assertEquals(10, forumStatistics.getAvgCommtPerUser(), 0.1);
    }
}
