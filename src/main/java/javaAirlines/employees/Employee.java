package javaAirlines.employees;

public abstract class Employee {

    private String name;
    private Ranks rank;

    public Employee(String name, Ranks rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }
}
