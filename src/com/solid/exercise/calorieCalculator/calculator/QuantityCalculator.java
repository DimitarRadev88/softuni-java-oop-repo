package com.solid.exercise.calorieCalculator.calculator;

import com.solid.exercise.calorieCalculator.calculator.interfaces.Calculator;
import com.solid.exercise.calorieCalculator.products.interfaces.Drink;
import com.solid.exercise.calorieCalculator.products.interfaces.Food;
import com.solid.exercise.calorieCalculator.products.interfaces.Product;

import java.util.List;

public class QuantityCalculator implements Calculator {

    @Override
    public double sum(List<Product> productsList) {
        double sum = 0;

        for (Product product : productsList) {
            if (product instanceof Drink drink) {
                sum += drink.getAmountInLiters() * drink.getDensity();
            } else if (product instanceof Food food) {
                sum += food.getAmountInKilograms();
            }
        }

        return sum;
    }

    @Override
    public double average(List<Product> productsList) {
        return sum(productsList) / productsList.size();
    }

}

