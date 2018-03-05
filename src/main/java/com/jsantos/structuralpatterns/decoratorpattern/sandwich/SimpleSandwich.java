package com.jsantos.structuralpatterns.decoratorpattern.sandwich;

/**
 * This is the basic implementation of what we want in a sandwich, and is considered the ConcreteComponent in the UML diagram.
 *
 * Created by jsantos on 10/12/17.
 */
public class SimpleSandwich implements Sandwich {

    public String make() {
        return "Simple Sandwich";
    }
}
