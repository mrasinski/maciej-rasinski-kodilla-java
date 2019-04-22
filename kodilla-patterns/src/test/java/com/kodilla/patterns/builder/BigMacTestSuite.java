package com.kodilla.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Without sesame")
                .burgers(2)
                .sauce("BBQ")
                .ingredient("Salad")
                .ingredient("Bacon")
                .ingredient("Onion")
                .ingredient("Cheese")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
