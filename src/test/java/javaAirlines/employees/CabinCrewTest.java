package javaAirlines.employees;

import javaAirlines.passangers.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    private CabinCrew cabinCrew;


    @Before
    public void before(){
        cabinCrew = new CabinCrew("Kaley Cuoco",Ranks.FlightAttendant);

    }

    @Test
    public void hasName() {
        assertEquals("Kaley Cuoco", cabinCrew.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Ranks.FlightAttendant, cabinCrew.getRank());
    }

    @Test
    public void canRelayMessage() {
        String message = cabinCrew.relayMessage("we will be serving refreshments shortly.");
        String expect = "This is cabin crew, we will be serving refreshments shortly.";
        assertEquals(expect, message);
    }


}
