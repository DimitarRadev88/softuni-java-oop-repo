package com.solid.lab.openClosedPrinciple.shoppingCart;

public class ItemPriceCalculator {

    public static double calculatePrice(String sku, int quantity) {

        if (sku.startsWith("EACH")) {
            return quantity * 5.0;
        } else if (sku.startsWith("WEIGHT")) {
            // quantity is in grams, price is per kg
            return quantity * 4.0 / 1000;
        } else if (sku.startsWith("SPECIAL")) {
            // $0.40 each; 3 for $1.00
            double price = quantity * 4.0;
            int setsOfThree = quantity / 3;
            price -= setsOfThree * 2.0;
            return price;
        } else {
            throw new IllegalArgumentException("Unknown item SKU!");
        }
    }

}
