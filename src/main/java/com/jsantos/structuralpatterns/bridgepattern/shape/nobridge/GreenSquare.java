package com.jsantos.structuralpatterns.bridgepattern.shape.nobridge;

/**
 * Created by jsantos on 9/20/17.
 */
public class GreenSquare extends Square {

    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
