package com.designPatterns.exercise.factory.cake;

public class ChocolateCake extends CakeImpl {

    private static final double CHOCOLATE_CAKE_DIAMETER = 20.0;
    private static final double CHOCOLATE_CAKE_PRICE = 30.0;
    private static final int CHOCOLATE_CAKE_PIECES = 8;

    public ChocolateCake() {
        super(CHOCOLATE_CAKE_DIAMETER, CHOCOLATE_CAKE_PRICE, CHOCOLATE_CAKE_PIECES);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing chocolate cake");
    }

    @Override
    public void bake() {
        System.out.println("Baking chocolate cake base");
    }

    @Override
    public void box() {
        System.out.println("Putting chocolate cake in box");
    }

}
