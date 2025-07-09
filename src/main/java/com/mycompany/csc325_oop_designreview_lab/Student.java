package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {
    private double gpa;
    private String address;
    private int credits;

    public Student(String name, int age, int credits) {
        super(name, (short) age);
        this.credits = credits;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa + ", Credits: " + credits;
    }
}
