package com.polymorphism.lab.wildFarm.animal.mammal.feline;

import com.polymorphism.lab.wildFarm.animal.mammal.Mammal;

public abstract class Feline extends Mammal {

    protected Feline(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

}
