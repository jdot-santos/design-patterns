package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 50.55;
    }
}
