package com.designPatterns.exercise.singleton;

public class Hashcode {
    private static Hashcode hashcode;
    private String point;

    private Hashcode() {
        this.point = "A";
    }

    public static Hashcode getInstance() {
        if (hashcode == null) {
            hashcode = new Hashcode();
        }
        return hashcode;
    }

    public String getPoint() {
        return point;
    }
}
