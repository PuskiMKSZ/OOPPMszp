package oop.labor05.model;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Training(ArrayList<Student> enrollStudents, double pricePerStudent, MyDate endDate, MyDate startDate, Course course) {
        this.enrolledStudents = enrollStudents;
        this.pricePerStudent = pricePerStudent;
        this.endDate = endDate;
        this.startDate = startDate;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public boolean enroll(Student student){
        return enrolledStudents.add(student);
    }

    public Student findStudentByID(String ID){
        for(Student student : enrolledStudents){
            if(student.getID().equals(ID))
                return student;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }


}