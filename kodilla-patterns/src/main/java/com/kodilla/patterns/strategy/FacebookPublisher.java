package com.kodilla.patterns.strategy;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Sharing via Facebook";
    }
}
