package javaAirlines.flights;

import javaAirlines.employees.CabinCrew;
import javaAirlines.employees.Pilot;
import javaAirlines.passangers.Passenger;
import javaAirlines.planes.Plane;

import java.util.*;

public class Flight {

    private ArrayList<Pilot> pilots;

    private ArrayList<CabinCrew> cabinCrew;

    private ArrayList<Passenger> bookedPassengers;

    private Plane plane;

    private String flightNumber;

    private String departure;

    private String destination;

    private Date departureTime;


    public Flight(Plane plane, String flightNumber, String departure, String destination, Date departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.bookedPassengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
    }


    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<CabinCrew> getCabinCrew() {
        return cabinCrew;
    }

    public void setCabinCrew(ArrayList<CabinCrew> cabinCrew) {
        this.cabinCrew = cabinCrew;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(ArrayList<Passenger> bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public int countPilots() {
        return this.pilots.size();
    }

    public void addCabinCrew(CabinCrew cabinCrew) {
        this.cabinCrew.add(cabinCrew);
    }

    public int countCabinCrew() {
        return this.cabinCrew.size();
    }

    public void addPassenger(Passenger passenger) {
        this.bookedPassengers.add(passenger);
    }

    public int countPassengers() {
        return this.bookedPassengers.size();
    }

    public int countAvailableSeats() {
        return this.plane.getPlane().getCapacity() - this.countPassengers();
    }

    public void BookPassenger(Passenger passenger) {
        if (this.countPassengers() < this.plane.getPlane().getCapacity()) {
            passenger.setFlight(this.flightNumber);
            allocatePassengerSeat(passenger);
            addPassenger(passenger);
        }
    }

    public ArrayList<Integer> getBookedSeatsNumbers() {
        ArrayList<Integer> bookedSeats = new ArrayList<>();

        if (this.bookedPassengers.size() > 0) {
            for (Passenger passengerSeat : this.bookedPassengers) {
                bookedSeats.add(passengerSeat.getSeatNumber());
            }
        }
        return bookedSeats;
    }

    public void allocatePassengerSeat(Passenger passenger) {
        Random randomSeat = new Random();
        int min = 1;
        int max = this.plane.getPlane().getCapacity();
        int seatNumber = 0;
        boolean uniqueSeat = false;

        while (!uniqueSeat) {
            seatNumber = randomSeat.nextInt((max - min) + 1) + min;
            if (!this.getBookedSeatsNumbers().contains(seatNumber)) {
                uniqueSeat = true;
            }
        }
        passenger.setSeatNumber(seatNumber);
    }

    public Boolean checkNoDublicateSteats() {

        ArrayList<Integer> list = this.getBookedSeatsNumbers();
        Set<Integer> set = new HashSet<Integer>(list);


        return set.size() == list.size();
    }

}
