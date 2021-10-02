package javaAirlines.employees;

public class CabinCrew extends Employee {



    public CabinCrew(String name, Ranks rank) {
        super(name, rank);

    }

    public String relayMessage(String message){
        return "This is cabin crew, " + message;

    }
}
