package com.designPatterns.exercise.singleton;

public class HashcodeDemo {
    public static void main(String[] args) {
        Hashcode hashcode = Hashcode.getInstance();
        System.out.println(hashcode.hashCode());

        Hashcode secondHashcode = Hashcode.getInstance();
        System.out.println(secondHashcode.hashCode());

        System.out.println(hashcode.getPoint() == secondHashcode.getPoint());

    }

}
