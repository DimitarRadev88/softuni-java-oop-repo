package com.solid.exercise.calorieCalculator.products;

public class Coke extends DrinkImpl {
    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;

    public Coke(double milliliters) {
        super(milliliters);
    }

    @Override
    public double getDensity() {
        return DENSITY;
    }

    @Override
    public double getCaloriesPer100Grams() {
        return CALORIES_PER_100_GRAMS;
    }

}
