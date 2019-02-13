package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("37523685")));
        europe.addCountry(new Country("Germany", new BigDecimal("456523685")));
        europe.addCountry(new Country("Austria", new BigDecimal("546871613")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("20145687468")));
        asia.addCountry(new Country("Bangladesh", new BigDecimal("56416486")));
        asia.addCountry(new Country("Japan", new BigDecimal("87463186")));

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new Country("USA", new BigDecimal("51658489168")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("37523685")));

        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Sudan", new BigDecimal("1864665684")));
        africa.addCountry(new Country("Egipt", new BigDecimal("843218")));
        africa.addCountry(new Country("Algeria", new BigDecimal("168458469")));
        africa.addCountry(new Country("Congo", new BigDecimal("849616847")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(africa);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal("75910083194");
        Assert.assertEquals(expected, totalPeople);
    }
}
