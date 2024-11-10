package com.polymorphism.lab.wildFarm.animal.mammal;

import com.polymorphism.lab.wildFarm.animal.Animal;
import com.polymorphism.lab.wildFarm.food.Food;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        setLivingRegion(livingRegion);
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(food.getQuantity());
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("####.##");
        return super.toString() +  String.format("[%s, %s, %s, %d]",
                getAnimalName(), df.format(getAnimalWeight()), livingRegion, getFoodEaten());
    }

}
