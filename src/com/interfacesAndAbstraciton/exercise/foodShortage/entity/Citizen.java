package com.interfacesAndAbstraciton.exercise.foodShortage.entity;

import com.interfacesAndAbstraciton.exercise.foodShortage.entity.interfaces.Buyer;
import com.interfacesAndAbstraciton.exercise.foodShortage.entity.interfaces.Person;
import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.interfaces.Identifiable;

public class Citizen implements Identifiable, Buyer, Person {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public void buyFood() {
        food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
