# What is the command pattern?

The command pattern encapsulates each request as an object and is very good at decoupling the sender from the processor. This decoupling increases maintainability and enables the system to be more flexible and grow over time. 

Each callback request in a command pattern is object oriented instead of another method added inside of a growing class.

# When would you use the command pattern?

The command pattern is useful:

* if you're working with a large system and you want to want to separate out the business logic and functions.
* if you want to implement undo functionality to your app. In this case, the entire request should be first contained within the command and then rollback can occur. 

# What are some real-life examples of the command pattern?

Some real-life examples of the command pattern include:
* java.lang.Runnable
* javax.swing.Action

# How do I design the command pattern?

Designing the command pattern is different than other patterns, in the sense that a command is treated as a verb. This can be seen as breaking OO design because objects aren't usually verbs but rather the methods inside the objects are. As long as this pattern is justified, then it's okay to use!

The heart of the command is the Command interface, in which all implementations of said actions/commands inside the application will implement the interface. The Command interface, in its simplest form, contains an execute method which all of the action is performed. If an undo feature is required, then an unexecute or undo method will be used instead. The `Command` interface provides the structure for the `Invoker` to abstractly execute on `ConcreteCommand` objects.

Advanced implementations of the command pattern use reflection to completely decouple the client from the receiver or processor using a callback.

The `Receiver` has an action method that the execute command is performed on. The `Client` doesn't call this action directly, but rather works with the `Invoker` to issue the command -- hence the action is decoupled from the client. 

See `uml-diagram_command-pattern.png` for a UML diagram on this. 