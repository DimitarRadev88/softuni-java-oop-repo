package com.polymorphism.exercise.vehicles.vehicle;

public class Car extends VehicleImpl {

    private static final double AC_FUEL_INCREASE = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public double getAcFuelIncrease() {
        return AC_FUEL_INCREASE;
    }
}
