package com.encapsulation.lab.validationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void increaseSalary(double bonus) {
        if (age < 30) {
            bonus /= 2;
        }
        setSalary(salary + salary * bonus / 100);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateName(firstName, "First");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateName(lastName, "Last");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        validateSalary(salary);
        this.salary = salary;
    }

    private static void validateSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
    }

    private static void validateName(String name, String text) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException(text + " name cannot be less than 3 symbols");
        }
    }

    private static void validateAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("####.0###########");
        return String.format("%s %s gets %s leva", firstName, lastName, df.format(salary));
    }
}
