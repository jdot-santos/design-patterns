package com.jsantos.behavioralpatterns.commandpattern.lightswitch;

/**
 * Represents a concrete command in the command pattern.
 *
 * The difference between the ToggleCommand and the On/Off commands is that this class is state aware.
 */
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
