package com.polymorphism.lab.wildFarm;

import com.polymorphism.lab.wildFarm.animal.*;
import com.polymorphism.lab.wildFarm.animal.mammal.feline.Cat;
import com.polymorphism.lab.wildFarm.animal.mammal.Mouse;
import com.polymorphism.lab.wildFarm.animal.mammal.feline.Tiger;
import com.polymorphism.lab.wildFarm.animal.mammal.Zebra;
import com.polymorphism.lab.wildFarm.food.Food;
import com.polymorphism.lab.wildFarm.food.Meat;
import com.polymorphism.lab.wildFarm.food.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        List<Animal> animalList = new ArrayList<>();
        while (!"End".equals(input)) {
            Animal animal = parseAnimal(input);
            Food food = parseFood(reader.readLine());

            animal.makeSound();

            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animalList.add(animal);

            input = reader.readLine();
        }

        animalList.forEach(System.out::println);
    }

    private static Food parseFood(String text) {
        String[] info = text.split(" ");
        return switch (info[0]) {
            case "Meat" -> new Meat(Integer.valueOf(info[1]));
            case "Vegetable" -> new Vegetable(Integer.valueOf(info[1]));
            default -> throw new IllegalArgumentException("Unknown food type!");
        };
    }

    private static Animal parseAnimal(String text) {
        String[] info = text.split(" ");

        return switch (info[0]) {
            case "Cat" -> new Cat(info[1], info[0], Double.valueOf(info[2]), info[3], info[4]);
            case "Tiger" -> new Tiger(info[1], info[0], Double.valueOf(info[2]), info[3]);
            case "Zebra" -> new Zebra(info[1], info[0], Double.valueOf(info[2]), info[3]);
            case "Mouse" -> new Mouse(info[1], info[0], Double.valueOf(info[2]), info[3]);
            default -> throw new IllegalArgumentException("Unknown animal type!");
        };

    }
}
