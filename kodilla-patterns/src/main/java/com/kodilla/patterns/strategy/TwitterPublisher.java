package com.kodilla.patterns.strategy;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Sharing via Twitter";
    }
}
