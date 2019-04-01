package com.kodilla.good.patterns.flights;

import java.util.*;

public class AirCompany {

    private List<Flight> flightList;

    public AirCompany() {
        flightList = new ArrayList<>();
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirCompany that = (AirCompany) o;
        return Objects.equals(flightList, that.flightList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightList);
    }

    public void createListOfFlights() {

        Flight warKrkLdz = new Flight("Warsaw", "Krakow","Lodz");
        Flight warGdy = new Flight("Warsaw", "Gdynia");
        Flight wroWarGda = new Flight("Wroclaw", "Warsaw", "Gdansk");
        Flight berPar = new Flight("Berlin", "Paris");
        Flight parWar = new Flight("Paris", "Warsaw");
        Flight berLdzWar = new Flight("Berlin", "Lodz", "Warsaw");
        Flight berWar = new Flight("Berlin", "Warsaw");
        Flight berMonWar = new Flight("Berlin", "Monachium", "Warsaw");

        this.getFlightList().add(warKrkLdz);
        this.getFlightList().add(warGdy);
        this.getFlightList().add(wroWarGda);
        this.getFlightList().add(berPar);
        this.getFlightList().add(parWar);
        this.getFlightList().add(berWar);
        this.getFlightList().add(berLdzWar);
        this.getFlightList().add(berMonWar);
    }

    private void flightFromCity(String fromCity) {
        this.getFlightList().stream()
                .filter(flight1 -> flight1.getFlightFrom().equals(fromCity))
                .forEach(flight1 -> System.out.println("Flights from " + fromCity + ":\n" +
                        flight1.getFlightTo()));
    }

    private void flightToCity(String toCity) {
        this.getFlightList().stream()
                .filter(flight1 -> flight1.getBetweenFlight() == null)
                .filter(flight1 -> flight1.getFlightTo().equals(toCity))
                .forEach(flight1 -> System.out.println("Flights to " + toCity + ":\n" +
                        flight1.getFlightFrom()));
    }

    private void flightWithBetweenCity(String betweenCity) {
        this.getFlightList().stream()
                .filter(flight -> flight.getBetweenFlight() != null)
                .filter(flight1 -> flight1.getBetweenFlight().equals(betweenCity))
                .forEach(flight1 -> System.out.println("Flight from " + flight1.getFlightFrom() + ", to " + flight1.getFlightTo() +
                        " between " + betweenCity));
    }

    public static void main(String[] args) {

        AirCompany airCompany = new AirCompany();

        airCompany.createListOfFlights();
        airCompany.flightFromCity("Warsaw");
        airCompany.flightToCity("Warsaw");
        airCompany.flightWithBetweenCity("Lodz");


    }
}
