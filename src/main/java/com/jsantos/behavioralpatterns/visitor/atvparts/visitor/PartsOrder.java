package com.jsantos.behavioralpatterns.visitor.atvparts.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A ConcreteElement
 */
public class PartsOrder implements AtvPart {

    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {}

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    /**
     * This is different than the other AvtPart implementations because this is responsible for building the whole piece of the order.
     *
     * Note that just like the other ConcreteElements, this method also references itself as part of the Visitor pattern.
     * @param visitor
     */
    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
