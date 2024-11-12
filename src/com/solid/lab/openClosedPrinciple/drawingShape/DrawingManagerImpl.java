package com.solid.lab.openClosedPrinciple.drawingShape;

import com.solid.lab.openClosedPrinciple.drawingShape.interfaces.DrawingManager;
import com.solid.lab.openClosedPrinciple.drawingShape.interfaces.Shape;
import com.solid.lab.openClosedPrinciple.drawingShape.interfaces.ShapeDrawer;

public class DrawingManagerImpl implements DrawingManager {

    private ShapeDrawer shapeDrawer;

    public DrawingManagerImpl(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    @Override
    public void draw(Shape shape) {
        if (shape instanceof Circle) {
            shapeDrawer.drawCircle(shape);
        } else if (shape instanceof Rectangle) {
            shapeDrawer.drawRectangle(shape);
        }
    }

}
