package com.encapsulation.exercise.animalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", name, age, productPerDay());
    }

    private void setName(String name) {
        validateName(name);
        this.name = name;
    }

    private void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    private static void validateName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    private static void validateAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    private double calculateProductPerDay() {
        if (age < 6) {
            return 2;
        } else if (age < 12) {
            return 1;
        }
        return 0.75;
    }

}
