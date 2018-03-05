package com.jsantos.structuralpatterns.bridgepattern.movie;

import java.util.List;

/**
 * Formatter is used similar to how @{@link com.jsantos.shape.withbridge.Color} was used in that demo
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
