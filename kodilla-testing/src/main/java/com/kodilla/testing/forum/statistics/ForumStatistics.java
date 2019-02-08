package com.kodilla.testing.forum.statistics;

import java.util.*;

public class ForumStatistics implements Statistics {

    private int posts;
    private int comments;
    private double avgPostPerUser;
    private double avgCommtPerUser;
    private double avgCommtPerPost;
    private List<String> userNames = new ArrayList<>();

    @Override
    public List<String> usersNames() {
        return userNames;
    }

    @Override
    public int postsCount() {
        return posts;
    }

    @Override
    public int commentsCount() {
        return comments;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public double getAvgCommtPerUser() {
        return avgCommtPerUser;
    }

    public double getAvgCommtPerPost() {
        return avgCommtPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if(statistics.usersNames().size() == 0) {
            avgPostPerUser = 0;
            avgCommtPerUser = 0;
            avgCommtPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        } else if (statistics.postsCount() == 0){
            avgPostPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
            avgCommtPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
            avgCommtPerPost = 0;
        } else {
            avgPostPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
            avgCommtPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
            avgCommtPerPost = (double) statistics.commentsCount() / statistics.postsCount();
        }
    }

    public String showStatistics() {
        return "Number of users: " + this.usersNames().size() +
                "Number of posts: " + this.postsCount() +
                "Number of comments: " + this.commentsCount() +
                "Average post per user: " + this.avgPostPerUser +
                "Average comment per user: " + this.avgCommtPerUser +
                "Average comment per post: " + this.avgCommtPerPost;
    }
}
