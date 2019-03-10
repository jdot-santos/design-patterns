package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

/**
 * Represents a ConcreteVisitor.
 *
 * Notice that adding functionality to this PartOrder functionality means only adding another ConcreteVisitor class and update the Demo class.
 */
public class AtvPartsDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Fender fender) {
        System.out.println("We have a fender");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("We have a wheel");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("We have oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order");
    }
}
