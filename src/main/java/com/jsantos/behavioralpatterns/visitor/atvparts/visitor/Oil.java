package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

public class Oil implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
