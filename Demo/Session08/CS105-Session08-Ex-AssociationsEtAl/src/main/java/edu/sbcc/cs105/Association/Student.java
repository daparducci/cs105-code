package edu.sbcc.cs105.Association;

/**
 * Student
 */
public class Student {

    private final Schedule schedule;
    private final String name;

    public Student(final String name, String currentTerm) {

        this.name = name;
        this.schedule = new Schedule(currentTerm);
    }

    public String getName() {
        return name;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}