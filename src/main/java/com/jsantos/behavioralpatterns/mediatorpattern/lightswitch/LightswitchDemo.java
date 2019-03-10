package com.jsantos.behavioralpatterns.mediatorpattern.lightswitch;

/**
 * This class showcases the Mediator pattern, as it reconfigures the Light and LightSwitch demo in the Command Pattern package to
 * instead implement the mediator.
 *
 * You can extend this demo to create a Fan object and have the ability to turn off/on all fans, or toggle individual rooms
 *
 * Another extension of this demo is to tie it to an alarm clock, which at 6 A.M. it turns on the bedroom light and the fan. But doesn't turn on any of the other ones in the house.
 *
 * You can do all this using the mediator pattern, and the beauty is that the objects don't kow about their own state.
 */
public class LightswitchDemo {

    /**
     * Notice how this demo is much cleaner looking than the Command Pattern's {@link com.jsantos.behavioralpatterns.commandpattern.lightswitch.LightSwitchDemo}.
     *
     * The big key here is that this is a combination of both the Command Pattern and the Mediator pattern.
     * @param args
     */
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        registerLights(mediator);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);

        turnOnAllLightsCommand.execute();
        turnOffAllLightsCommand.execute();
    }

    /**
     * By implementing a registration of lights, we're cleaning up the code by removing the ability of passing in a list of lights.
     * @param mediator
     */
    private static void registerLights(Mediator mediator) {
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);
    }
}
