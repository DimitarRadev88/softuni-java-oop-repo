package com.solid.exercise.calorieCalculator.calculator.interfaces;

import com.solid.exercise.calorieCalculator.products.interfaces.Product;
import com.solid.lab.openClosedPrinciple.shoppingCart.Order;

import java.util.List;

public interface Calculator {

    double sum(List<Product> productsList);

    double average(List<Product> productsList);

}
