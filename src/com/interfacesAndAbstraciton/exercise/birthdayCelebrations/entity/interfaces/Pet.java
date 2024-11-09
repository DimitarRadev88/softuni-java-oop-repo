package com.interfacesAndAbstraciton.exercise.birthdayCelebrations.entity.interfaces;

import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.interfaces.Birthable;

public class Pet implements Birthable {

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

}
