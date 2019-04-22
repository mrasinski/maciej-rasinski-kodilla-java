package com.kodilla.patterns.strategy;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Sharing via Snapchat";
    }
}
