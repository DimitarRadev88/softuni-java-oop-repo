package com.polymorphism.lab.shapes;

import com.polymorphism.lab.shapes.shape.Circle;
import com.polymorphism.lab.shapes.shape.Rectangle;
import com.polymorphism.lab.shapes.shape.Shape;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(1.00, 2.00);
        Shape circle = new Circle(3.00);

        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}
