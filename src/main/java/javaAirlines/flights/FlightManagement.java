package javaAirlines.flights;

import javaAirlines.planes.Plane;
import javaAirlines.planes.PlaneTypes;

public class FlightManagement {

    private Flight flight;

    public FlightManagement(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double passengerLuggageAllowance() {
        return (flight.getPlane().getPlane().getWeight()/2)/flight.getPlane().getPlane().getCapacity();
    }

    public double countLuggageWeightOfFlight() {
        return this.flight.countPassengers()*this.passengerLuggageAllowance();
    }

    public double countLuggageWeightOfFlightRemaining() {
        return (flight.getPlane().getPlane().getWeight()/2)-this.countLuggageWeightOfFlight();
    }
}
