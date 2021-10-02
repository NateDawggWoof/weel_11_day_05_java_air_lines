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

public class FlightManagementTest {


    private Plane plane1;
    private Passenger passenger1;
    private Pilot pilot1;
    private CabinCrew cabinCrew1;
    private Flight flight1;
    private FlightManagement flightManagement;
    private  Date date1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneTypes.AirBusMaveric);
        passenger1 = new Passenger("Lara Croft",2);
        pilot1 = new Pilot("Samus Aran", Ranks.Captain,"123FlyWithMe");
        cabinCrew1 = new CabinCrew("Kaley Cuoco",Ranks.FlightAttendant);
        date1 = new Date(121, 9, 5, 5,30,0);
        flight1 = new Flight(plane1,"F001","EDI","GLA",date1);
        flightManagement = new FlightManagement(flight1);

    }

    @Test
    public void checkPassengerLuggageAllowance(){
        assertEquals(100.00,flightManagement.passengerLuggageAllowance(),0.001);
    }

    @Test
    public void checkLuggageWeightOfFlight(){
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        assertEquals(300.00, flightManagement.countLuggageWeightOfFlight(), 0.001);
    }

    @Test
    public void checkLuggageWeightOfFlightRemaining(){
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        flight1.BookPassenger(passenger1);
        assertEquals(100.00, flightManagement.countLuggageWeightOfFlightRemaining(), 0.001);
    }

}
