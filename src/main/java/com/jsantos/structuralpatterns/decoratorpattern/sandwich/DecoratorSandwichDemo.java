package com.jsantos.structuralpatterns.decoratorpattern.sandwich;

/**
 * This is a demo of the Decorator Pattern in action.
 *
 * This might look like a creational pattern at first glance, but this is actually modifying the structure of SimpleSandwich by use of a decorator which makes it a decorator pattern.
 * Created by jsantos on 10/12/17.
 */
public class DecoratorSandwichDemo {
    public static void main(String[] args) {
        Sandwich simpleSandwich = new SimpleSandwich(); // base sandwich

        // both MeatDecorator and DressingDecorator can take both Sandwich or decorator class in its constructor
        Sandwich meatSandwich = new MeatDecorator(simpleSandwich);
        Sandwich sandwichWithMeatAndDressing = new DressingDecorator(meatSandwich);

        // or you can do the one-liner below
//        Sandwich sandwichWithMeatAndDressing = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwichWithMeatAndDressing.make());
    }
}
