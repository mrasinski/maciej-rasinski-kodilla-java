package com.kodilla.good.patterns.flights;

public class Flight {

    private String flightFrom;
    private String betweenFlight;
    private String flightTo;

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public Flight(String flightFrom, String betweenFlight, String flightTo) {
        this.flightFrom = flightFrom;
        this.betweenFlight = betweenFlight;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getBetweenFlight() {
        return betweenFlight;
    }

    public String getFlightTo() {
        return flightTo;
    }
}
