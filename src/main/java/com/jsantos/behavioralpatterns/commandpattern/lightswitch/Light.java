package com.jsantos.behavioralpatterns.commandpattern.lightswitch;

/**
 * Represents the Receiver in the command pattern
 */
public class Light {

    /**
     * A boolean representing the state of the light. Defaults to false
     */
    private boolean isOn = false;
    private String name;

    public Light(String name) {
        this.name = name;
    }

    /**
     * This method takes advantage of the Light state.
     */
    public void toggle() {
        if(isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        System.out.println("Light " + name + " switched on");
    }

    public void off() {
        System.out.println("Light " + name + " switched off");
    }
}
