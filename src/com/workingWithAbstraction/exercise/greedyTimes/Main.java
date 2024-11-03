package com.workingWithAbstraction.exercise.greedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] itemAndQuantityPairs = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);

        fillBag(itemAndQuantityPairs, bag);

        System.out.println(bag);
    }

    private static void fillBag(String[] itemAndQuantityPairs, Bag bag) {
        for (int i = 0; i < itemAndQuantityPairs.length; i += 2) {
            String name = itemAndQuantityPairs[i];
            long count = Long.parseLong(itemAndQuantityPairs[i + 1]);
            bag.add(name, count);
        }
    }


}