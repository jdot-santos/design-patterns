package com.jsantos.structuralpatterns.bridgepattern.shape.nobridge;

/**
 * Created by jsantos on 9/20/17.
 */
public class RedCircle extends Circle {

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
