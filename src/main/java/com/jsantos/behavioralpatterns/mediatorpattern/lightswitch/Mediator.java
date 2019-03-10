package com.jsantos.behavioralpatterns.mediatorpattern.lightswitch;

import java.util.ArrayList;
import java.util.List;

/**
 * A mediator can be an interface, abstract, or a concrete instance.
 *
 */
public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    /**
     * This shows the mediator in action. Notice that the {@link Light} object controls its state but the mediator (i.e., this Mediator class) will go through and determine whether or not it should or should not call it.
     */
    public void turnOnAllLights() {
        for (Light light: lights) {
            if (!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffAllLights() {
        for (Light light: lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
