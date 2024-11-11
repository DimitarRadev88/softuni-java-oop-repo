package com.polymorphism.exercise.vehicles.vehicle;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double distanceTravelled;
    private double tankCapacity;
    private String type;

    protected VehicleImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        acOn();
        setTankCapacity(tankCapacity);
        setType(getClass().getSimpleName());
    }

    @Override
    public void acOff() {
        setFuelConsumption(getFuelConsumption() - getAcFuelIncrease());
    }

    @Override
    public void acOn() {
        setFuelConsumption(getFuelConsumption() + getAcFuelIncrease());
    }

    public abstract double getAcFuelIncrease();

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String drive(double distance) {
        if (distance * fuelConsumption > fuelQuantity) {
            throw new IllegalArgumentException(String.format("%s needs refueling", type));
        }

        setDistanceTravelled(getDistanceTravelled() + distance);
        setFuelQuantity(getFuelQuantity() - getFuelConsumption() * distance);
        return String.format("%s travelled %s km", type, new DecimalFormat("####.##").format(distance));
    }

    @Override
    public void refuel(double liters) {
        if (liters + getFuelQuantity() > getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        setFuelQuantity(fuelQuantity + liters);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", type, fuelQuantity);
    }

}
