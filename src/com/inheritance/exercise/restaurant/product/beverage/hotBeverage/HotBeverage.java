package com.inheritance.exercise.restaurant.product.beverage.hotBeverage;

import com.inheritance.exercise.restaurant.product.beverage.Beverage;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {

    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

}
