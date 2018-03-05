package com.jsantos.structuralpatterns.bridgepattern.shape.withbridge;

/**
 * Created by jsantos on 9/20/17.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
