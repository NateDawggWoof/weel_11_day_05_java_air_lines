package javaAirlines.passangers;

import javaAirlines.employees.CabinCrew;
import javaAirlines.employees.Pilot;
import javaAirlines.employees.Ranks;
import javaAirlines.flights.Flight;
import javaAirlines.planes.Plane;
import javaAirlines.planes.PlaneTypes;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Plane plane1;
    private Passenger passenger1;
    private Pilot pilot1;
    private CabinCrew cabinCrew1;
    private Flight flight1;
    private Date date1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneTypes.AirBusMaveric);
        passenger1 = new Passenger("Lara Croft",2);
        pilot1 = new Pilot("Samus Aran", Ranks.Captain,"123FlyWithMe");
        cabinCrew1 = new CabinCrew("Kaley Cuoco",Ranks.FlightAttendant);
        date1 = new Date(121, 9, 5, 5,30,0);
        flight1 = new Flight(plane1,"F001","EDI","GLA",date1);

    }

    @Test
    public void hasName(){
        assertEquals("Lara Croft", passenger1.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(2, passenger1.getBags());
    }

    @Test
    public void hasFlight(){
        flight1.BookPassenger(passenger1);
        assertEquals(flight1.getFlightNumber(), passenger1.getFlight());
    }

    @Test
    public void hasSeat1(){
        flight1.BookPassenger(passenger1);
        assertEquals(4, passenger1.getSeatNumber());
    }




}
