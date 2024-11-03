package com.workingWithAbstraction.exercise.trafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(new Scanner(System.in));
        engine.start();
    }
}
