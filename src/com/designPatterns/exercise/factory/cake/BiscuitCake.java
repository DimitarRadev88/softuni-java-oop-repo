package com.designPatterns.exercise.factory.cake;

public class BiscuitCake extends CakeImpl {

    private static final double BISCUIT_CAKE_DIAMETER = 30.0;
    private static final double BISCUIT_CAKE_PRICE = 20.0;
    private static final int BISCUIT_CAKE_PIECES = 12;

    public BiscuitCake() {
        super(BISCUIT_CAKE_DIAMETER, BISCUIT_CAKE_PRICE, BISCUIT_CAKE_PIECES);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing biscuit cake");
    }

    @Override
    public void bake() {
        System.out.println("No baking needed!");
    }

    @Override
    public void box() {
        System.out.println("Putting biscuit cake in box");
    }
}
