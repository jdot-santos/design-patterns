package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

public class Oil implements AtvPart {
    @Override
    public double calculateShipping() {
        return 9.99;
    }
}
