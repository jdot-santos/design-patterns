package com.jsantos.behavioralpatterns.commandpattern.lightswitch;

/**
 * Represents the concrete command in the command pattern.
 *
 * A downside to this implementation is that it doesn't store the state of the light object.
 *
 */
public class OnCommand implements Command {

    private Light light;

    /**
     * By having a constructor with the receiver, we can do a callback.
     * @param light
     */
    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
