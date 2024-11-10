package com.polymorphism.lab.shapes.shape;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        setPerimeter(calculatePerimeter());
        setArea(calculateArea());
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    protected Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    protected Double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
