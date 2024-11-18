package com.designPatterns.exercise.factory;

import com.designPatterns.exercise.factory.factory.CakeFactory;
import com.designPatterns.exercise.factory.pastryShop.PastryShop;

public class Main {
    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();
        PastryShop pastryShop = new PastryShop(factory);

        pastryShop.placeOrder("White");
        pastryShop.placeOrder("Chocolate");
        pastryShop.placeOrder("Biscuit");
        pastryShop.placeOrder("Spinach");

    }
}
