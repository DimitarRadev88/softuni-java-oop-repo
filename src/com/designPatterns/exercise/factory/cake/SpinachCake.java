package com.designPatterns.exercise.factory.cake;

public class SpinachCake extends CakeImpl {

    private static final double SPINACH_CAKE_DIAMETER = 35.0;
    private static final double SPINACH_CAKE_PRICE = 50.0;
    private static final int SPINACH_CAKE_PIECES = 6;

    public SpinachCake() {
        super(SPINACH_CAKE_DIAMETER, SPINACH_CAKE_PRICE, SPINACH_CAKE_PIECES);
    }

    @Override
    public void prepare() {
        System.out.println("Why oh why!?");
    }

    @Override
    public void bake() {
        System.out.println("What is this atrocity?");
    }

    @Override
    public void box() {
        System.out.println("Throwing spinach cake in garbage where it belongs!");
    }

}
