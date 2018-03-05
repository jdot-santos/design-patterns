package com.jsantos.structuralpatterns.bridgepattern.shape.withbridge;

/**
 * Created by jsantos on 9/20/17.
 */
public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
