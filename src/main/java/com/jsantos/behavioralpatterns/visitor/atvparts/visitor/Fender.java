package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

/**
 * A ConcreteElement
 */
public class Fender implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
