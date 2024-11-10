package com.polymorphism.lab.mathOperation;

public class Main {
    public static void main(String[] args) {

        MathOperation operation = new MathOperation();

        System.out.println(operation.add(1, 2));
        System.out.println(operation.add(1, 2, 3));
        System.out.println(operation.add(1, 2, 3, 4));
    }
}
