package com.kodilla.stream.world;

import java.util.*;

public final class Continent {

    private final String nameOfContinent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public boolean removeCountry(Country country) {
        return countryList.remove(country);
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(nameOfContinent, continent.nameOfContinent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfContinent);
    }
}
