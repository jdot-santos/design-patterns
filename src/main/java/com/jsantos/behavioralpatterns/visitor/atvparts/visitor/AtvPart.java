package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
