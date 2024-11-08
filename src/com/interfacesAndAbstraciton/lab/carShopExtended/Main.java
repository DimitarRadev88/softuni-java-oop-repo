package com.interfacesAndAbstraciton.lab.carShopExtended;

import com.interfacesAndAbstraciton.lab.carShopExtended.car.interfaces.Car;
import com.interfacesAndAbstraciton.lab.carShopExtended.car.interfaces.Rentable;
import com.interfacesAndAbstraciton.lab.carShopExtended.car.interfaces.Sellable;
import com.interfacesAndAbstraciton.lab.carShopExtended.car.rentable.Audi;
import com.interfacesAndAbstraciton.lab.carShopExtended.car.sellable.Seat;

public class Main {
    public static void main(String[] args) {
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);
    }

    private static void printCarInfo(Car car) {
        System.out.printf("%s is %s color and have %s horse power%n",
                car.getModel(),
                car.getColor(),
                car.getHorsePower());
        System.out.println(car.toString());
    }

}
