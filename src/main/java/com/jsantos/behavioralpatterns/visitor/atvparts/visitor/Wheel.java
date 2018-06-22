package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

/**
 * A ConcreteElement
 */
public class Wheel implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
