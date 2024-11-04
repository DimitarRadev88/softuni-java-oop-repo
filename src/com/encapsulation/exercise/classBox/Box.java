package com.encapsulation.exercise.classBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        validateValue(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        validateValue(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        validateValue(height, "Height");
        this.height = height;
    }

    private void validateValue(double value, String text) {
        if (value <= 0) {
            throw new IllegalArgumentException(text + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        return calculateLateralSurfaceArea() + 2 * length * width;

    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("""
                        Surface Area - %.2f
                        Lateral Surface Area - %.2f
                        Volume - %.2f
                        """,
                calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume());
    }
}
