package com.inheritance.exercise.animals;

import com.inheritance.exercise.animals.animal.*;
import com.inheritance.exercise.animals.animal.cat.Cat;
import com.inheritance.exercise.animals.animal.cat.Kitten;
import com.inheritance.exercise.animals.animal.cat.Tomcat;
import com.inheritance.exercise.animals.animal.dog.Dog;
import com.inheritance.exercise.animals.animal.frog.Frog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        while (!"Beast!".equals(input)) {
            String info = reader.readLine();
            try {
                Animal animal = createAnimal(input, info);
                System.out.println(animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            input = reader.readLine();
        }
    }

    private static Animal createAnimal(String type, String info) {
        String[] animalInfo = info.split(" ");
        String name = animalInfo[0];
        int age = Integer.parseInt(animalInfo[1]);

        return switch (type) {
            case "Cat" -> new Cat(name, age, animalInfo[2]);
            case "Dog" -> new Dog(name, age, animalInfo[2]);
            case "Frog" -> new Frog(name, age, animalInfo[2]);
            case "Kitten" -> new Kitten(name, age);
            case "Tomcat" -> new Tomcat(name, age);
            default -> throw new IllegalArgumentException("Invalid input");
        };
    }
}
