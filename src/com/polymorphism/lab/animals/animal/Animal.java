package com.polymorphism.lab.animals.animal;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public abstract String explainSelf();

    @Override
    public String toString() {
        return String.format("I am %s and my favourite food is %s", name, favouriteFood);
    }
}
