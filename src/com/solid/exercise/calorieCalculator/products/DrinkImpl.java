package com.solid.exercise.calorieCalculator.products;

import com.solid.exercise.calorieCalculator.products.interfaces.Drink;

public abstract class DrinkImpl implements Drink {

    private double milliliters;

    protected DrinkImpl(double milliliters) {
        this.milliliters = milliliters;
    }

    @Override
    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public double getCaloriesPer100Grams() {
        return getDensity() * getMilliliters();
    }

    @Override
    public double getCaloriesAmount() {
        return getCaloriesPer100Grams() * getMilliliters() * getDensity() / 100;
    }

    @Override
    public double getAmountInLiters() {
        return getMilliliters() / 1000;
    }

}
