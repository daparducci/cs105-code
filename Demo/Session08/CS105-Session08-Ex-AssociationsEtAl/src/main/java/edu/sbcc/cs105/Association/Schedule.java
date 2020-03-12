package edu.sbcc.cs105.Association;

import java.util.ArrayList;

public class Schedule {

    private final ArrayList<Course> courses = new ArrayList<Course>();
    private final String term;

    public Schedule(final String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }

    public void addCourse(final Course course) {
        courses.add(course);

    }

    public void dropCourse(final String courseCode) {

        Course courseToDrop = null;

        for (final Course course : courses) {
            if (course.getEnrollCode().equals(courseCode)) {
                courseToDrop = course;
                break;
            }
        }

        if (courseToDrop != null) {
            courses.remove(courseToDrop);
        }
    }

    public double getEnrolledUnits() {

        double unitsEnrolled = 0;

        for (final Course course : courses) {
            unitsEnrolled += course.getUnits();
        }

        return unitsEnrolled;
    }
}
