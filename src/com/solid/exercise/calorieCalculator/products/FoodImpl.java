package com.solid.exercise.calorieCalculator.products;

import com.solid.exercise.calorieCalculator.products.interfaces.Food;

public abstract class FoodImpl implements Food {

    private double grams;

    protected FoodImpl(double grams) {
        this.grams = grams;
    }

    @Override
    public double getGrams() {
        return grams;
    }

    @Override
    public double getCaloriesAmount() {
        return getCaloriesPer100Grams() * getGrams() / 100;
    }

    @Override
    public double getAmountInKilograms() {
        return getGrams() / 1000;
    }

}

