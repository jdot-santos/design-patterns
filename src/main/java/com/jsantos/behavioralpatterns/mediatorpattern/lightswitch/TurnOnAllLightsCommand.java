package com.jsantos.behavioralpatterns.mediatorpattern.lightswitch;

/**
 * This is similar to the Command pattern's {@link com.jsantos.behavioralpatterns.commandpattern.lightswitch.AllLightsOnCommand} AllLightsOnCommand.
 *
 * The main difference is that this class using the mediator pattern to turn on all the lights.
 *
 * Note this class still do what Commands should do, it's just that this class utilize the mediator which handles the aggregate of commands.
 *
 * This is an example of how the Command pattern and the mediator pattern can be used together.
 */
public class TurnOnAllLightsCommand implements Command {
    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
