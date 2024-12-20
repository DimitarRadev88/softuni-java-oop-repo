package com.interfacesAndAbstraciton.lab.carShopExtended.car.rentable;

import com.interfacesAndAbstraciton.lab.carShopExtended.car.CarImpl;
import com.interfacesAndAbstraciton.lab.carShopExtended.car.interfaces.Rentable;

public class Audi extends CarImpl implements Rentable {
    private Integer minRentDay;
    private Double pricePerDay;
    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() +
                System.lineSeparator() +
                String.format("Minimum rental period of %d days. Price per day %.6f", minRentDay, pricePerDay);
    }
}
