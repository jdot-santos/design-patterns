package com.jsantos.behavioralpatterns.visitor.atvparts.nonvisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {}

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    public double calculateShipping() {
        double total = 0.0;
        for (AtvPart part : parts) {
            total += part.calculateShipping();
        }
        return total;
    }
}
