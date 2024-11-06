package com.inheritance.exercise.restaurant.product.food.mainDish;

import com.inheritance.exercise.restaurant.product.food.Food;

import java.math.BigDecimal;

public class MainDish extends Food {

    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

}
