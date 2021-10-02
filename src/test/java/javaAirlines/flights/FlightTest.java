package javaAirlines.flights;

import javaAirlines.employees.CabinCrew;
import javaAirlines.employees.Pilot;
import javaAirlines.employees.Ranks;
import javaAirlines.passangers.Passenger;
import javaAirlines.planes.Plane;
import javaAirlines.planes.PlaneTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane1;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Pilot pilot1;
    private CabinCrew cabinCrew1;
    private Flight flight1;
    private Date date1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneTypes.AirBusMaveric);
        passenger1 = new Passenger("Lara Croft",2);
        passenger2 = new Passenger("Jill Valentine",0);
        passenger3 = new Passenger("Chun Li",1);
        passenger4 = new Passenger("Rinoa Heartilly",5);
        pilot1 = new Pilot("Samus Aran", Ranks.Captain,"123FlyWithMe");
        cabinCrew1 = new CabinCrew("Kaley Cuoco",Ranks.FlightAttendant);
        date1 = new Date(121, 9, 5, 5,30,0);
        flight1 = new Flight(plane1,"F001","EDI","GLA",date1);

    }

    @Test
    public void hasPilot0(){
        assertEquals(0, flight1.getPilots().size());
    }

    @Test
    public void hasCabinCrew0(){
        assertEquals(0, flight1.getCabinCrew().size());
    }

    @Test
    public void hasPassengers0(){
        assertEquals(0, flight1.getBookedPassengers().size());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("F001", flight1.getFlightNumber());
    }

    @Test
    public void hasDepartureNumber(){
        assertEquals("EDI", flight1.getDeparture());
    }

    @Test
    public void hasDestinationNumber(){
        assertEquals("GLA", flight1.getDestination());
    }

    @Test
    public void canAddPilot(){
        flight1.addPilot(pilot1);
        assertEquals(1, flight1.countPilots());
    }

    @Test
    public void addCabinCrew(){
        flight1.addCabinCrew(cabinCrew1);
        flight1.addCabinCrew(cabinCrew1);
        assertEquals(2, flight1.countCabinCrew());
    }

    @Test
    public void addPassengers(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        assertEquals(3, flight1.countPassengers());
    }

    @Test
    public void checkAvailableSeats(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.countAvailableSeats());
    }

    @Test
    public void checkBookSeatsWorksUnderCapacity(){
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        assertEquals(1, flight1.countAvailableSeats());
    }

    @Test
    public void checkBookSeatsWorksWithCapacityLimit(){
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        assertEquals(4, flight1.countPassengers());
    }

    @Test
    public void hasDeparture(){
        String dateString = date1.toString();
        assertEquals("Tue Oct 05 05:30:00 BST 2021", dateString);
    }

    @Test
    public void hasUniqueSeatNumberTrue(){
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger2);
        flight1.BookPassenger(passenger3);
        flight1.BookPassenger(passenger4);
        Boolean result = flight1.checkNoDublicateSteats();
        assertEquals(true, result);
    }

    @Test
    public void hasUniqueSeatNumberFalse(){
        flight1.BookPassenger(passenger1);
        passenger1.setSeatNumber(1);
        flight1.BookPassenger(passenger2);
        passenger2.setSeatNumber(1);
        flight1.BookPassenger(passenger3);
        flight1.BookPassenger(passenger4);
        Boolean result = flight1.checkNoDublicateSteats();
        assertEquals(false, result);
    }

















}
