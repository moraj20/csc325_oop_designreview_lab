package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {
    private double gpa;
    private String address;

    public Student(String name, short age, double gpa, String address) {
        super(name, age);
        this.gpa = gpa;
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa + ", Address: " + address;
    }
}
