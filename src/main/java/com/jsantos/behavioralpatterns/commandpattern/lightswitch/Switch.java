package com.jsantos.behavioralpatterns.commandpattern.lightswitch;

/**
 * Represents the Invoker in the command pattern, which is used to abstractly call the Command interface's execute() method.
 *
 * You can implement this so that you can have a separate store() and execute() methods. Below is an example of a method with both.
 */
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
