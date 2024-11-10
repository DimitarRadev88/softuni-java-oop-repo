package com.polymorphism.lab.animals.animal;

public class Cat extends Animal {

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.toString() + System.lineSeparator() + "MEEOW";
    }

}
