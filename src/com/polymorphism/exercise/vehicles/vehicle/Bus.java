package com.polymorphism.exercise.vehicles.vehicle;

public class Bus extends VehicleImpl {

    private static final double AC_FUEL_INCREASE = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public double getAcFuelIncrease() {
        return AC_FUEL_INCREASE;
    }

}
