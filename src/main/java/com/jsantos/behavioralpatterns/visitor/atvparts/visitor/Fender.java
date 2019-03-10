package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

/**
 * Represents a ConcreteElement
 */
public class Fender implements AtvPart {

    /**
     * Notice that the method signature is the same for every implementation of an {@link AtvPart}. It's the only way for us to get this hook in here given the demo implementation.
     * @param visitor
     */
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
