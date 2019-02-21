package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(Flight flight) {
        super("Cannot go to " + flight.getArrivalAirport() + " choose different place");
    }
}
