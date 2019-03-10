package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

/**
 * Note that every time something is modified to the {@link AtvPart} interface, this class along with {@link Wheel} and {@link Oil} need to be modified as well.
 *
 * Doing it this way would be unreasonable if there were thousands of ATV parts and you need to add other methods to AtvPart
 */
public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 50.55;
    }
}
