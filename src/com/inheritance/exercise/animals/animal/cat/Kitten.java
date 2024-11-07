package com.inheritance.exercise.animals.animal.cat;

public class Kitten extends Cat {
    private static final String KITTEN_GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, KITTEN_GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
