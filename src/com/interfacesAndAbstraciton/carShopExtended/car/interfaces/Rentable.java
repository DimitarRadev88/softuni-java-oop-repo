package com.interfacesAndAbstraciton.carShopExtended.car.interfaces;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
