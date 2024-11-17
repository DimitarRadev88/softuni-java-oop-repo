package com.designPatterns.lab.facade2.product;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public void increasePrice(int amount) {
        setPrice(price + amount);
    }

    public void decreasePrice(int amount) {
        setPrice(price - amount);
    }

    @Override
    public String toString() {
        return String.format("Current price for the %s product is %d.$", name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
