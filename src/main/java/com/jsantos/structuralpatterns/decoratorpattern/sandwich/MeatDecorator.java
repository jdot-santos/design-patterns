package com.jsantos.structuralpatterns.decoratorpattern.sandwich;

/**
 * This is the ConcreteDecorator portion of the UML diagram.
 *
 * This allows us to add functionality to the SandwichDecorator class, as you can see in the make() method.
 *
 * This uses inheritance to extend the decorator and using composition in order to pass the instance we're working with and add functionality.
 * Created by jsantos on 10/12/17.
 */
public class MeatDecorator extends SandwichDecorator {

    // this adds functionality through compositions
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}
