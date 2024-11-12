package com.solid.lab.dependencyInvertion.helloWorld;

public class HelloWorld {
    public String greeting(String name, int time) {
        if (time < 12) {
            return "Good morning, " + name;
        }

        if (time < 18) {
            return "Good afternoon, " + name;
        }

        return "Good evening, " + name;
    }

}
