package com.solid.lab.singleResponsibility.drawingShape;

import com.solid.lab.singleResponsibility.drawingShape.interfaces.DrawingRepository;
import com.solid.lab.singleResponsibility.drawingShape.interfaces.Renderer;
import com.solid.lab.singleResponsibility.drawingShape.interfaces.Shape;

public class RendererImpl implements Renderer {

    @Override
    public void render(DrawingRepository drawingRepository, Shape shape) {
        drawingRepository.add(shape);
    }

}
