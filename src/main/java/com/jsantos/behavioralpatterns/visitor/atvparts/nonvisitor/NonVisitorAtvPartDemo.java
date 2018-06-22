package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

/**
 * This is a demo of how you would create an ATV Part application without using the Visitor Pattern, e.g., how you would write this historically.
 *
 * See {@link AtvPart} for more details on the non-visitor pattern version
 *
 * To see the Visitor pattern implemented version of this. Please see /{@link com.jsantos.behavioralpatterns.visitor.atvparts.visitor.VisitorAtvPartDemo}
 */
public class NonVisitorAtvPartDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        System.out.println(order.calculateShipping());
    }
}
