package com.jsantos.structuralpatterns.decoratorpattern.sandwich;

/**
 * This is the ConcreteDecorator portion of the UML diagram.
 *
 * Created by jsantos on 10/12/17.
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}
