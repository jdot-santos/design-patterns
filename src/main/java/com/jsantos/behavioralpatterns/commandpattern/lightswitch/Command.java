package com.jsantos.behavioralpatterns.commandpattern.lightswitch;

/**
 * Represents the Command interface in the command pattern.
 *
 * This can also be an abstract class that has a protected Light object. By doing this, you're enabling the concrete classes to use the light object without having to instantiate it.
 */
public interface Command {
    public void execute();
}
