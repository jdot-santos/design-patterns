package com.jsantos.structuralpatterns.bridgepattern.shape.withbridge;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
