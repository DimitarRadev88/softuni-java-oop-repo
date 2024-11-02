package com.workingWithAbstraction.lab.hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.2f", getPrice(scanner.nextLine().split(" ")));
    }

    private static double getPrice(String[] info) {
        double pricePerDay = Double.parseDouble(info[0]);
        int days = Integer.parseInt(info[1]);
        String seasonName = info[2];
        String discountTypeName = info[3];
        return PriceCalculator.calculatePrice(pricePerDay, days, seasonName, discountTypeName);
    }
}
