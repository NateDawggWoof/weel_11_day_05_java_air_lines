package javaAirlines.employees;

public class Pilot extends Employee {

    private String licence;

    public Pilot(String name, Ranks rank, String licence) {
        super(name, rank);
        this.licence = licence;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String fly(){
        return "Weeeee!";
    }
}
