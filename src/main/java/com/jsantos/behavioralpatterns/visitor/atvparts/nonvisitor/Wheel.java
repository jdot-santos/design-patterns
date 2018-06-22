package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

public class Wheel implements AtvPart {
    @Override
    public double calculateShipping() {
        return 300.99;
    }
}
