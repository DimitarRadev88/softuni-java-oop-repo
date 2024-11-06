package com.inheritance.exercise.playersAndMonsters;

import com.inheritance.exercise.playersAndMonsters.hero.BladeKnight;
import com.inheritance.exercise.playersAndMonsters.hero.Knight;

public class Main {
    public static void main(String[] args) {

        Knight k = new BladeKnight("gosho", 5);

        System.out.println(k);
    }
}
