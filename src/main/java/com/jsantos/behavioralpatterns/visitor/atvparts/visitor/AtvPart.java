package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

/**
 * Represents the Element interface
 */
public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
