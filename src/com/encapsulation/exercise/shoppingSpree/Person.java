package com.encapsulation.exercise.shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product) {
        if (money < product.getCost()) {
            throw new IllegalArgumentException((String.format("%s can't afford %s", name, product.getName())));
        }

        setMoney(money - product.getCost());
        products.add(product);
        System.out.printf("%s bought %s", name, product.getName());
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", name, products.isEmpty() ?
                "Nothing bought" :
                products.stream().map(Product::getName).collect(Collectors.joining(", ")));
    }
}
