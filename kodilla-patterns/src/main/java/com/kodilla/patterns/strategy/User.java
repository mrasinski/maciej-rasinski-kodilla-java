package com.kodilla.patterns.strategy;

public class User {
    private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setShareMethod(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}