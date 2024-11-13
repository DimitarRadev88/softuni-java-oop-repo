package com.solid.exercise.calorieCalculator.products;

public class Chips extends FoodImpl {
    public static final double CALORIES_PER_100_GRAMS = 529.0;

    public Chips(double grams) {
        super(grams);
    }

    @Override
    public double getCaloriesPer100Grams() {
        return CALORIES_PER_100_GRAMS;
    }

}
