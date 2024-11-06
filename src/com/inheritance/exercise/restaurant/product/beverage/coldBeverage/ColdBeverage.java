package com.inheritance.exercise.restaurant.product.beverage.coldBeverage;

import com.inheritance.exercise.restaurant.product.beverage.Beverage;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage {

    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

}
