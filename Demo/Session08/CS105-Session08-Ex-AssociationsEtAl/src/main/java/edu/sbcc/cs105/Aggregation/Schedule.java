package edu.sbcc.cs105.Aggregation;

import java.util.ArrayList;

public class Schedule {

    private ArrayList<CourseSection> courses = new ArrayList<CourseSection>();

    public void addCourse(CourseSection course){
        courses.add(course);
    }

    public void dropCourse(String courseCode){

        CourseSection courseToDrop = null;

        for (CourseSection course : courses) {
            if (course.getEnrollCode().equals(courseCode)){
                courseToDrop = course;
                break;
            }
        }

        if (courseToDrop != null){
            courses.remove(courseToDrop);
        }
    }

    public double getEnrolledUnits(){

        double unitsEnrolled = 0;

        for (CourseSection course : courses) {
            unitsEnrolled += course.getUnits();
        }

        return unitsEnrolled;
    }
}
