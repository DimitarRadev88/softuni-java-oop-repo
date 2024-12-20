package com.interfacesAndAbstraciton.exercise.multipleImplementation.entity;

import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.interfaces.Birthable;
import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.interfaces.Identifiable;
import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.interfaces.Person;

public class Citizen implements Birthable, Identifiable, Person {

    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
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
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
