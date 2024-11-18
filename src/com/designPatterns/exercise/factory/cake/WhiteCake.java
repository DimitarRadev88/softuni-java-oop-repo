package com.designPatterns.exercise.factory.cake;

public class WhiteCake extends CakeImpl {

    private static final double WHITE_CAKE_DIAMETER = 25.0;
    private static final double WHITE_CAKE_PRICE = 28.0;
    private static final int WHITE_CAKE_PIECES = 10;

    public WhiteCake() {
        super(WHITE_CAKE_DIAMETER, WHITE_CAKE_PRICE, WHITE_CAKE_PIECES);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing white cake");
    }

    @Override
    public void bake() {
        System.out.println("Baking white cake base");
    }

    @Override
    public void box() {
        System.out.println("Packing white cake in a box");
    }
}
