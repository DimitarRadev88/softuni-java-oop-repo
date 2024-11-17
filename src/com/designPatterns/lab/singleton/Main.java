package com.designPatterns.lab.singleton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> capitals = new HashMap<>(
                Map.of(
                        "Sofia", 1200000,
                        "Varna", 300000
                )
        );

        SingletonContainer instance = SingletonDataContainer.getInstance();
        System.out.println(instance.getPopulation(capitals, "Sofia"));
        SingletonContainer secondInstance = SingletonDataContainer.getInstance();
        System.out.println(instance.getPopulation(capitals, "Varna"));

    }
}
