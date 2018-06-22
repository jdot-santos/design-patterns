package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

public interface AtvPart {

    /**
     * The fallback with having this type of method is that if you make a change to this method or add more methods, you have to modify all of the AtvPart concrete objects in the application.
     * @return
     */
    public double calculateShipping();
}
