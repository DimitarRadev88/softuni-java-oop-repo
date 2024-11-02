package com.workingWithAbstraction.lab.pointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        return point.getCoordinateX() >= bottomLeft.getCoordinateX() &&
                point.getCoordinateY() >= bottomLeft.getCoordinateY() &&
                point.getCoordinateX() <= topRight.getCoordinateX() &&
                point.getCoordinateY() <= topRight.getCoordinateY();
    }
}
