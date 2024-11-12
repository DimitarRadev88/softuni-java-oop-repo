package com.solid.lab.singleResponsibility.drawingShape;

import com.solid.lab.singleResponsibility.drawingShape.interfaces.DrawingRepository;
import com.solid.lab.singleResponsibility.drawingShape.interfaces.Shape;

import java.util.ArrayList;
import java.util.Collection;

public class DrawingRepositoryImpl implements DrawingRepository {

    private Collection<Shape> shapes;

    public DrawingRepositoryImpl() {
        this.shapes = new ArrayList<>();
    }

    @Override
    public void add(Shape shape) {
        shapes.add(shape);
    }

}
