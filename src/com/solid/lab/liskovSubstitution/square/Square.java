package com.solid.lab.liskovSubstitution.square;

public class Square extends Rectangle {

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @SuppressWarnings("SuspiciousNameCombination")
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @SuppressWarnings("SuspiciousNameCombination")
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

}
