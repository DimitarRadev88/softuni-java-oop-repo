package com.workingWithAbstraction.exercise.trafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Engine {

    private Scanner scanner;
    public Engine(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        TrafficLight[] lights = getTrafficLights();

        changeColors(lights);

    }

    private void changeColors(TrafficLight[] lights) {
        int changes = Integer.parseInt(this.scanner.nextLine());

        for (int i = 0; i < changes; i++) {
            Arrays.stream(lights).forEach(TrafficLight::changeColor);
            printColors(lights);
        }
    }

    private static void printColors(TrafficLight[] lights) {
        Arrays.stream(lights).forEach(light -> System.out.print(light.getColor() + " "));
        System.out.println();
    }

    private TrafficLight[] getTrafficLights() {
        return Arrays.stream(this.scanner.nextLine().split(" "))
                .map(color -> new TrafficLight(TrafficLightColor.valueOf(color))).toArray(TrafficLight[]::new);
    }
}
