package com.designPatterns.lab.facade;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilderFacade()
                .info()
                    .withType("Mitsubishi")
                    .withColor("Red")
                    .withNumberOfDoors(4)
                .built()
                    .inCity("Kurashiki")
                    .atAddress("Somewhere over there")
                .build();

        System.out.println(car);

    }

}
