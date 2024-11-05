package com.encapsulation.exercise.pizzaCalories;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pizza {
    private static final  Set<String> TOPPING_TYPES = Set.of("Meat", "Veggies", "Cheese", "Sauce");
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    public double getOverallCalories() {
        return toppings.stream().mapToDouble(Topping::calculateCalories).sum() + dough.calculateCalories();
    }

    public void addTopping(Topping topping) {
        if (!TOPPING_TYPES.contains(topping.getToppingType())) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", topping.getToppingType()));
        }

        toppings.add(topping);
    }

    public String getName() {
        return name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
        if (name.isBlank() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", name, getOverallCalories());
    }
}
