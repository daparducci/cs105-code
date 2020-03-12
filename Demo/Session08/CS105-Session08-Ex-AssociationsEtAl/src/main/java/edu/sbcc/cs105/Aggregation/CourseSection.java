package edu.sbcc.cs105.Aggregation;

import java.util.ArrayList;

/**
 * CourseSection
 */
public class CourseSection {

    private ArrayList<Student> students = new ArrayList<>();

   
    private String enrollCode;
    private String name;
    private double units;

    public CourseSection(String enrollCode, String name, double units) {
        this.enrollCode = enrollCode;
        this.setName(name);
        this.setUnits(units);
    }

    public void addStudent(Student student){

        student.getSchedule().addCourse(this);
        this.addStudent(student);
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