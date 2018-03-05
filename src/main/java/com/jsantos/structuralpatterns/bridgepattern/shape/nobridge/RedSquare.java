package com.jsantos.structuralpatterns.bridgepattern.shape.nobridge;

/**
 * Created by jsantos on 9/20/17.
 */
public class RedSquare extends Square {

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
