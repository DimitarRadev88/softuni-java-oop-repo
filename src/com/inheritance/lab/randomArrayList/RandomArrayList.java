package com.inheritance.lab.randomArrayList;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<T> extends ArrayList<T> {

    public T getRandomElement() {
        return get(ThreadLocalRandom.current().nextInt(size()));
    }

}
