package com.solid.exercise.calorieCalculator.calculator;

import com.solid.exercise.calorieCalculator.calculator.interfaces.Calculator;
import com.solid.exercise.calorieCalculator.products.interfaces.Product;

import java.util.List;

public class CalorieCalculator implements Calculator {

    @Override
    public double sum(List<Product> products) {
        return products.stream().mapToDouble(Product::getCaloriesAmount).sum();
    }

    @Override
    public double average(List<Product> products) {
        return sum(products) / products.size();
    }

}
