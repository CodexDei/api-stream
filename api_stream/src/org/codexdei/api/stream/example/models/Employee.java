package org.codexdei.api.stream.example.models;

public class Employee {

    private String name;
    private String departament;
    private double salary;

    public Employee(String name, String departament, double salary){

        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName(){

        return this.name;
    }

    public String getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", salary=" + salary +
                '}';
    }
}
