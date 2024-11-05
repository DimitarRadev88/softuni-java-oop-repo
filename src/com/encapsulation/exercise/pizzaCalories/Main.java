package com.encapsulation.exercise.pizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] pizzaInfo = reader.readLine().split(" ");

        Pizza pizza = new Pizza(pizzaInfo[1], Integer.parseInt(pizzaInfo[2]));

        String[] doughInfo = reader.readLine().split(" ");

        pizza.setDough(new Dough(doughInfo[1], doughInfo[2], Integer.parseInt(doughInfo[3])));

        String input = reader.readLine();

        while (!"END".equals(input)) {
            String[] toppingInfo = input.split(" ");
            pizza.addTopping(new Topping(toppingInfo[1], Integer.parseInt(toppingInfo[2])));
            input = reader.readLine();
        }

        System.out.println(pizza);
    }
}
