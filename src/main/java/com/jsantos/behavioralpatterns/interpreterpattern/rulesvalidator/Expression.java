package com.jsantos.behavioralpatterns.interpreterpattern.rulesvalidator;

/**
 *  Represents the AbstractExpression. This can also be an abstract class, especially if you need to pass anything down to the subclasses.
 */
public interface Expression {

    public boolean interpret(String context);
}
