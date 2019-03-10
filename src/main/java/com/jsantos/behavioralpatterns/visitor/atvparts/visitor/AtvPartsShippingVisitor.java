package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

import java.util.List;

/**
 * Represents a ConcreteVisitor
 *
 * Notice that the algorithm and the logic are inside this class, as opposed to having it spread all over the Elements.
 */
public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Fender fender) {
        shippingAmount += 15;
        System.out.println("Wheels are bulky and expensive to ship.");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 3;
        System.out.println("Fenders are light and cheap to ship.");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil is hazardous and has a fee to ship.");
    }


    /**
     * You can add further logic to enhance this, such as:
     *  - Add rebates to certain parts
     *  - Reduce shipping
     *  - Use coupon codes
     * @param partsOrder
     */
    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If they bought more than 3 things we'll give them a discount on shipping");
        List<AtvPart> parts = partsOrder.getParts();
        if(parts.size() > 3) {
            shippingAmount -= 5;
        }

        System.out.println("Shipping amount is: " + shippingAmount);
    }
}
