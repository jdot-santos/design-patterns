package com.jsantos.structuralpatterns.bridgepattern.shape.withbridge;

/**
 * Similar to @{@link com.jsantos.shape.nobridge.Shape} except for the parameterized constructor. This is so that we can utilize composition.
 *
 * Created by jsantos on 9/20/17.
 */
public abstract class Shape {

    protected Color color;

    // taking color in the constructor utilizes composition
    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
