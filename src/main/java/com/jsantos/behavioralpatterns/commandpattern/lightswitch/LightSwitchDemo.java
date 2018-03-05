package com.jsantos.behavioralpatterns.commandpattern.lightswitch;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsible for running a light switch demo using the command pattern.
 */
public class LightSwitchDemo {

    public static void main(String[] args) {
        doOnCommandDemo();
        doOffCommandDemo();
        doToggleCommandDemo();
        doAllOffCommand();
        doAllOnCommand();
    }

    private static void doAllOnCommand() {
        System.out.println("Executing the command pattern with the all on command");
        Light bedroomLight = new Light("bedroom");
        Light kitchenLight = new Light("bedroom");
        Switch lightSwitch = new Switch();

        // turn the bedroom light on to see if the macro command can successfully set all the lights to the same state.
        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsOnCommand = new AllLightsOnCommand(lights);
        lightSwitch.storeAndExecute(allLightsOnCommand);
        System.out.println();
    }

    private static void doOffCommandDemo() {
        System.out.println("Executing the command pattern with the off command");
        Light light = new Light("downstairs");
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);
        Command offCommand = new OffCommand(light);

        lightSwitch.storeAndExecute(onCommand); // turning on light to test the OffCommand
        lightSwitch.storeAndExecute(offCommand);
        System.out.println();
    }

    private static void doAllOffCommand() {
        System.out.println("Executing the command pattern with the all off command");
        Light bedroomLight = new Light("bedroom");
        Light kitchenLight = new Light("kitchen");
        Switch lightSwitch = new Switch();

        // turn the bedroom light on to see if the macro command can successfully set all the lights to the same state.
        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsOffCommand = new AllLightsOffCommand(lights);
        lightSwitch.storeAndExecute(allLightsOffCommand);
        System.out.println();
    }

    /**
     * Executes a toggle command.
     *
     * A good thing about this method is that we're not creating an On and Off command to toggle the switch. All we need is the Toggle Command and that command is doing the light toggle for us.
     */
    private static void doToggleCommandDemo() {
        System.out.println("Executing the command pattern with the toggle command");
        Light light = new Light("garage");
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        System.out.println();
    }

    private static void doOnCommandDemo() {
        System.out.println("Executing the command pattern with the on command");
        Light light = new Light("upstairs");
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);
        lightSwitch.storeAndExecute(onCommand);
        System.out.println();
    }
}
