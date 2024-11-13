package com.solid.exercise.calorieCalculator;

import com.solid.exercise.calorieCalculator.calculator.interfaces.Calculator;
import com.solid.exercise.calorieCalculator.products.interfaces.Product;

import java.util.List;

public class Printer {

    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";
    private final Calculator calculator;

    public Printer(Calculator calculator) {
        this.calculator = calculator;
    }

    public void printSum(List<Product> products) {
        System.out.printf((SUM) + "%n", calculator.sum(products));
    }

    public void printAverage(List<Product> products) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products));
    }

}
