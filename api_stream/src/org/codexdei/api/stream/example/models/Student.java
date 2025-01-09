package org.codexdei.api.stream.example.models;

public class Student {

    private String nameStudent;
    private double grade;

    public Student(String nameStudent, double grade) {
        this.nameStudent = nameStudent;
        this.grade = grade;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", grade=" + grade +
                '}';
    }
}
