package com.solid.exercise.calorieCalculator.products;

public class Chocolate extends FoodImpl {
    public static final double CALORIES_PER_100_GRAMS = 575.0;

    public Chocolate(double grams) {
        super(grams);
    }

    @Override
    public double getCaloriesPer100Grams() {
        return CALORIES_PER_100_GRAMS;
    }

}
