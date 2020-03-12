package edu.sbcc.cs105.Aggregation;

/**
 * Student
 */
public class Student {

    private final Schedule schedule;
    private final String name;

    public Student(final String name) {

        this.name = name;
        this.schedule = new Schedule();
    }

    public String getName() {
        return name;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}