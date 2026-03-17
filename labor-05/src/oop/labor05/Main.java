package oop.labor05;

import oop.labor05.model.Course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Course> readCourses(String filename) {

        ArrayList<Course> courses = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                String description = data[1];
                int numHours = Integer.parseInt(data[2]);

                Course course = new Course(name, description, numHours);

                courses.add(course);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return courses;
    }

    public static void main(String[] args) {

        ArrayList<Course> courses = readCourses("courses.csv");

        for (Course c : courses) {
            System.out.println(c);
        }

    }
}