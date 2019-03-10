package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

/**
 * Represents a Visitor. All ConcreteVisitors are going to extend from this.
 */
public interface AtvPartVisitor {

    void visit(Fender fender);

    void visit(Wheel wheel);

    void visit(Oil oil);

    void visit(PartsOrder partsOrder);
}
