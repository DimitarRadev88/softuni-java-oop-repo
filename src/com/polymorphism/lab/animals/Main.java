package com.polymorphism.lab.animals;

import com.polymorphism.lab.animals.animal.Animal;
import com.polymorphism.lab.animals.animal.Cat;
import com.polymorphism.lab.animals.animal.Dog;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Oscar", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");
        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());

    }
}
