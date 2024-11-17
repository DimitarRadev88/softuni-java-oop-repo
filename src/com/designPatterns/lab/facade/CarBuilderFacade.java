package com.designPatterns.lab.facade;

public class CarBuilderFacade {
    protected Car car;

    public CarBuilderFacade() {
        car = new Car();
    }

    public Car build() {
        return car;
    }

    public CarInfoBuilder info() {
        return new CarInfoBuilder(car);
    }

    public CarAddressBuilder built() {
        return new CarAddressBuilder(car);
    }

}
