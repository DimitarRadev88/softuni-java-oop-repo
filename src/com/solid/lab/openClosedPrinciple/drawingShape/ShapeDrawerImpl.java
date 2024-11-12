package com.solid.lab.openClosedPrinciple.drawingShape;

import com.solid.lab.openClosedPrinciple.drawingShape.interfaces.Shape;
import com.solid.lab.openClosedPrinciple.drawingShape.interfaces.ShapeDrawer;

public class ShapeDrawerImpl implements ShapeDrawer {

    @Override
    public void drawCircle(Shape shape) {
        System.out.println(shape);
    }

    @Override
    public void drawRectangle(Shape shape) {
        System.out.println(shape);
    }

}
