package com.encapsulation.lab.salaryIncrease;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double bonus) {
        if (age < 30) {
            bonus /= 2;
        }
        setSalary(salary + salary * bonus / 100);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("####.0###############");

        return String.format("%s %s gets %s leva", firstName, lastName, df.format(salary));
    }
}
