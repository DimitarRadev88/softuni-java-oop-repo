package com.interfacesAndAbstraciton.exercise.birthdayCelebrations.entity;

import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.interfaces.Identifiable;

public class Robot implements Identifiable {

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

}
