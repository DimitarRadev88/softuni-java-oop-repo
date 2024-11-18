package com.designPatterns.exercise.factory.factory;

import com.designPatterns.exercise.factory.cake.*;

public class CakeFactory {

    public Cake getCake(String type) {
        return switch (type) {
            case "White" -> createCake(new WhiteCake());
            case "Chocolate" -> createCake(new ChocolateCake());
            case "Biscuit" -> createCake(new BiscuitCake());
            case "Spinach" -> createCake(new SpinachCake());
            default -> throw new IllegalArgumentException("Unknown cake type");
        };
    }

    private Cake createCake(Cake cake) {
        cake.prepare();
        cake.bake();
        cake.box();
        return cake;
    }

}
