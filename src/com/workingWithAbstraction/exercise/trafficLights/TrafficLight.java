package com.workingWithAbstraction.exercise.trafficLights;

public class TrafficLight {
    private TrafficLightColor color;

    public TrafficLight(TrafficLightColor color) {
        this.color = color;
    }

    public void changeColor() {
        switch (this.color) {
            case RED -> this.color = TrafficLightColor.GREEN;
            case YELLOW -> this.color = TrafficLightColor.RED;
            case GREEN -> this.color = TrafficLightColor.YELLOW;
        }
    }

    public TrafficLightColor getColor() {
        return this.color;
    }
}
