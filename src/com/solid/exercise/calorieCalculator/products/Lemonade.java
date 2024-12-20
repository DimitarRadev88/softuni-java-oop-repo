package com.solid.exercise.calorieCalculator.products;

public class Lemonade extends DrinkImpl {
    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    public Lemonade(double milliliters) {
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
