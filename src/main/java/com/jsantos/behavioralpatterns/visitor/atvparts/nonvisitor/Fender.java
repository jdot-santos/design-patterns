package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

/**
 * Note that every time something is modified to the {@link AtvPart} interface, this class along with {@link Wheel} and {@link Oil} need to be modified as well.
 */
public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 50.55;
    }
}
