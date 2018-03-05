package com.jsantos.behavioralpatterns.commandpattern.lightswitch;

import java.util.List;

/**
 * Represents a concrete command in the command pattern.
 */
public class AllLightsOffCommand implements Command {

    private List<Light> lights;

    public AllLightsOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for(Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
