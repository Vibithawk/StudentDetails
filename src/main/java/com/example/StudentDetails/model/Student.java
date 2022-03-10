package com.example.StudentDetails.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("Students")
public class Student {

    @Id
    String id;

    public Student(String id, String name, String email, String studentNumber, String gpa, String courseName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.studentNumber = studentNumber;
        this.gpa = gpa;
        this.courseName = courseName;
    }

    String name;
    String email;
    String studentNumber;
    String gpa;
    String courseName;


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", gpa='" + gpa + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getGpa() {
        return gpa;
    }

    public String getCourseName() {
        return courseName;
    }



    }



