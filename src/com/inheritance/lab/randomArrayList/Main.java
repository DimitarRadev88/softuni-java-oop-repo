package com.inheritance.lab.randomArrayList;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();

        IntStream.range(0, 10).forEach(randomArrayList::add);

        System.out.println(randomArrayList.getRandomElement());
    }
}
