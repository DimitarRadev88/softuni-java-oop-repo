package com.solid.lab.singleResponsibility.drawingShape;

import com.solid.lab.singleResponsibility.drawingShape.interfaces.DrawingRepository;
import com.solid.lab.singleResponsibility.drawingShape.interfaces.DrawingManager;
import com.solid.lab.singleResponsibility.drawingShape.interfaces.Renderer;
import com.solid.lab.singleResponsibility.drawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Renderer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Renderer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }

    @Override
    public void draw(Shape shape) {
        renderer.render(drawingRepository, shape);
    }

}
