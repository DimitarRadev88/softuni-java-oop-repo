package com.designPatterns.exercise.factory.cake;

public abstract class CakeImpl implements Cake {
    public double diameter;
    public double price;
    public int pieces;

    protected CakeImpl(double diameter, double price, int pieces) {
        this.diameter = diameter;
        this.price = price;
        this.pieces = pieces;
    }
}