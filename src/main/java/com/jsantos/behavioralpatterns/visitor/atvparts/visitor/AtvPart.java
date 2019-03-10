package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

/**
 * Represents the Element interface
 */
public interface AtvPart {
    /**
     * This generic method allows us to get the visitor hooked into all the Concrete Elements
     * @param visitor
     */
    public void accept(AtvPartVisitor visitor);
}
