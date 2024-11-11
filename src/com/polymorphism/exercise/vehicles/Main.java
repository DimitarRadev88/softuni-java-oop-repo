package com.polymorphism.exercise.vehicles;

import com.polymorphism.exercise.vehicles.vehicle.Bus;
import com.polymorphism.exercise.vehicles.vehicle.Car;
import com.polymorphism.exercise.vehicles.vehicle.Truck;
import com.polymorphism.exercise.vehicles.vehicle.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static final Map<String, Vehicle> VEHICLE_MAP = new LinkedHashMap<>();
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        addVehicles();

        int commands = Integer.parseInt(READER.readLine());
        for (int i = 0; i < commands; i++) {
            parseCommand();
        }

        printVehicles();
    }

    private static void printVehicles() {
        VEHICLE_MAP.values().forEach(System.out::println);
    }

    private static void parseCommand() throws IOException {
        String[] command = READER.readLine().split(" ");
        switch (command[0]) {
            case "Drive" -> {
                drive(command);
            }
            case "Refuel" -> {
                refuel(command);
            }
            case "DriveEmpty" -> {
                driveEmpty(command);
            }

        }
    }

    private static void driveEmpty(String[] input) {
        if (input[1].equals("Bus")) {
            Vehicle bus = VEHICLE_MAP.get(input[1]);
            bus.acOff();
            try {
                bus.drive(Double.parseDouble(input[2]));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                bus.acOn();
            }
        }
    }

    private static void refuel(String[] input) {
        try {
            VEHICLE_MAP.get(input[1]).refuel(Double.parseDouble(input[2]));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void drive(String[] input) {
        try {
            System.out.println(VEHICLE_MAP.get(input[1]).drive(Double.parseDouble(input[2])));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addVehicles() throws IOException {
        String[] vehicleInfo = READER.readLine().split(" ");
        VEHICLE_MAP.put("Car", new Car(Double.parseDouble(vehicleInfo[1]), Double.parseDouble(vehicleInfo[2]), Double.parseDouble(vehicleInfo[3])));
        vehicleInfo = READER.readLine().split(" ");
        VEHICLE_MAP.put("Truck", new Truck(Double.parseDouble(vehicleInfo[1]), Double.parseDouble(vehicleInfo[2]), Double.parseDouble(vehicleInfo[3])));
        vehicleInfo = READER.readLine().split(" ");
        VEHICLE_MAP.put("Bus", new Bus(Double.parseDouble(vehicleInfo[1]), Double.parseDouble(vehicleInfo[2]), Double.parseDouble(vehicleInfo[3])));
    }

}

