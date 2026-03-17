package oop.labor05.model;

public class Student {

     String name;
     String email;
    String id;
    public Student(String name, String email,String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getID() {
        return id;
    }
}