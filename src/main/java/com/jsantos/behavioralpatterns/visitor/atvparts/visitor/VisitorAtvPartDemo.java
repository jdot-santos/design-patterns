package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

public class VisitorAtvPartDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        // this is the alternative to the nonvisitor order.calculateShipping() method
        order.accept(new AtvPartsShippingVisitor());

        // this method and the implementation of the AtvPartsDisplayVisitor is all that's needed to implement a way to display all the parts in this order.
        order.accept(new AtvPartsDisplayVisitor());
    }
}
