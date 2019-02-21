package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    private Map<String, Boolean> airportMap = new HashMap<>();

    public SearchFlight() {
        airportMap.put("Tokio", false);
        airportMap.put("Moscow", true);
        airportMap.put("Budapest", false);
        airportMap.put("Rome", true);
        airportMap.put("Berlin", true);
    }

    public boolean findFilght(Flight flight) throws RouteNotFoundException {

        if(airportMap.containsKey(flight.getArrivalAirport()) && airportMap.get(flight.getArrivalAirport())) {
            return true;
        } else {
            throw new RouteNotFoundException(flight);
        }
    }

    public static void main(String[] args) {

        SearchFlight searchFlight = new SearchFlight();

        Flight flight = new Flight("Warsaw", "Krakow");

        try {
            searchFlight.findFilght(flight);
            System.out.println("Take your bags you're going to " + flight.getArrivalAirport());
        } catch (RouteNotFoundException r) {
            System.out.println("Cannot go to " + flight.getArrivalAirport() + " choose different place");
        }

    }
}
