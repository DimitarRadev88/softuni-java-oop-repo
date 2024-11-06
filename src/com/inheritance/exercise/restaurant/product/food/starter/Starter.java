package com.inheritance.exercise.restaurant.product.food.starter;

import com.inheritance.exercise.restaurant.product.food.Food;

import java.math.BigDecimal;

public class Starter extends Food {

    public Starter(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

}
