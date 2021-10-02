package javaAirlines.planes;

import java.security.PrivateKey;

public class Plane {

    private PlaneTypes plane;

    public Plane(PlaneTypes plane) {
        this.plane = plane;
    }

    public PlaneTypes getPlane() {
        return plane;
    }

    public void setPlane(PlaneTypes plane) {
        this.plane = plane;
    }
}
