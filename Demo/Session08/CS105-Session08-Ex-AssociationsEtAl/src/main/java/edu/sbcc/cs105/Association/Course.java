package edu.sbcc.cs105.Association;

public class Course {

    private String enrollCode;
    private String name;
    private double units;

    public Course(String enrollCode, String name, double units) {
        this.enrollCode = enrollCode;
        this.setName(name);
        this.setUnits(units);
    }

    public double getUnits() {
        return units;
    }

    private void setUnits(double units) {
        this.units = units;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEnrollCode() {
        return enrollCode;
    }

    

}
