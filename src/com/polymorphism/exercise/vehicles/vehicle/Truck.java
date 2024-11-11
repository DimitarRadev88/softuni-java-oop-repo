package com.polymorphism.exercise.vehicles.vehicle;

public class Truck extends VehicleImpl {

    private static final double AC_FUEL_INCREASE = 1.6;
    private static final double MAX_FUEL_INCREASE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public double getAcFuelIncrease() {
        return AC_FUEL_INCREASE;
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * MAX_FUEL_INCREASE);
    }

}
