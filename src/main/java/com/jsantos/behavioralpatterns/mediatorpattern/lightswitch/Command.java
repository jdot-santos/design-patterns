package com.jsantos.behavioralpatterns.mediatorpattern.lightswitch;

/**
 * Represents the Colleague interface in the mediator pattern.
 *
 * This can also be an abstract class that has a protected Light object. By doing this, you're enabling the concrete classes to use the light object without having to instantiate it.
 */
public interface Command {
    public void execute();
}
