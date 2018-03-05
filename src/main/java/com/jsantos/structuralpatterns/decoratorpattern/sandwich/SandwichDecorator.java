package com.jsantos.structuralpatterns.decoratorpattern.sandwich;

/**
 * This is the base of our decorators.
 *
 * Note that this class implements Sandwich because decorators in general should be treated as objects. Doing this will avoid us creating different variations of a Sandwich, like a SimpleSandwich with meat, SimpleSandwich with cheese, SimpleSandwich with dressing, etc..
 * Created by jsantos on 10/12/17.
 */
public abstract class SandwichDecorator implements Sandwich {

    // this is what the sub-decorators will extend and build upon
    protected Sandwich customSandwich;

    /*
        Uses composition to pass in the sandwich. This can be a concrete class or another decorator.
     */
    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}
