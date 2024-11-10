package com.polymorphism.lab.shapes.shape;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double width, Double height) {
       this.width = width;
       this.height = height;
       setPerimeter(calculatePerimeter());
       setArea(calculateArea());
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    protected Double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    protected Double calculateArea() {
        return width * height;
    }

}
