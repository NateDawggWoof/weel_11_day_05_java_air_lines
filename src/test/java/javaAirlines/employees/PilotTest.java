package javaAirlines.employees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Samus Aran", Ranks.Captain,"123FlyWithMe");
    }

    @Test
    public  void hasName(){
        assertEquals("Samus Aran", pilot.getName());
    }

    @Test
    public  void hasRank(){
        assertEquals(Ranks.Captain, pilot.getRank());
    }

    @Test
    public  void hasLicence(){
        assertEquals("123FlyWithMe", pilot.getLicence());
    }

    @Test
    public  void canFly(){
        assertEquals("Weeeee!", pilot.fly());
    }

}
