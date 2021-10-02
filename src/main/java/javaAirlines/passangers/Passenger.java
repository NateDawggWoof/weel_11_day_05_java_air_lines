package javaAirlines.passangers;

import javaAirlines.flights.Flight;

public class Passenger {

    private String name;
    private int bags;
    private String flight;
    private int seatNumber;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = null;
        this.seatNumber = -1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
