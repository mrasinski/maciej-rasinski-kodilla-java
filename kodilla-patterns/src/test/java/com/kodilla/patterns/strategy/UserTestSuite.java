package com.kodilla.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Millenial Steven");
        User jack = new YGeneration("Y Jack");
        User nation = new ZGeneration("Z Nation");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShare);
        String jackShare = jack.sharePost();
        System.out.println("Jack should: " + jackShare);
        String nationShare = nation.sharePost();
        System.out.println("Z Nation should: " + nationShare);

        //Then
        Assert.assertEquals("Sharing via Snapchat", stevenShare);
        Assert.assertEquals("Sharing via Twitter", jackShare);
        Assert.assertEquals("Sharing via Facebook", nationShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Millenial Steven");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShare);
        steven.setShareMethod(new FacebookPublisher());
        stevenShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShare);

        //Then
        Assert.assertEquals("Sharing via Facebook", stevenShare);
    }
}
