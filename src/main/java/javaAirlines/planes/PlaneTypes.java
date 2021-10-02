package javaAirlines.planes;

public enum PlaneTypes {

    Boeing747(450, 112760.00),
    AirBus320(180, 83000.00),
    AirBus220(160,65000.00),
    AirBusMaveric(4,800.00);

    private final int capacity;
    private final double weight;

    PlaneTypes(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
