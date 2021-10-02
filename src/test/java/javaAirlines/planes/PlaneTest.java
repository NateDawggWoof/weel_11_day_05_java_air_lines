package javaAirlines.planes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneTypes.AirBusMaveric);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneTypes.AirBusMaveric,plane.getPlane());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4,plane.getPlane().getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(800,plane.getPlane().getWeight(), 0.001);
    }


}
