# What is the factory method pattern?

The factory method pattern is a parameter driven creational pattern, designed to allow the client to know little about what types of objects they are creating. All the client typically knows about is a common interface that the factory exposes.

Factories are oftentimes implemented by an architecture or framework and implemented by the user of the framework. The factory method pattern establishes a contract for how things will be implemented within the framework, but allowing flexibility for the end user to define how it can be implemented.

# How do you design a factory method pattern?

It's good to point out that the factory method pattern is responsible for creating instances and managing, at minimum, the creation portion of the lifecycle.

Another thing to note is that objects created from the factory method pattern are referenced through a common interface, which is what the client will be seeing. Factories will also reference multiple concrete classes/implementations, but the client is unaware of all the varieties since the factory method pattern shields them from that exposure.

The method to request an object is typically parameterized, which these parameters are used to determine which concrete class to return to the client. 

Please see `factory-method-pattern-uml-diagram.png` for a visual representation of the factory method pattern.

# What are examples of the factory method pattern?

Examples from the Java API include Calendar, ResourceBundles, and NumberFormat

# What's the pitfalls of using a factory method pattern?

The factory method pattern add a layer of complexity, as it introduces more code than not using the factory method pattern.

Another part that most people get wrong when implementing the factory is that creation doesn't take place in the factory itself, but rather in the subclasses of the type of factory method we are creating.

Factory method patterns are generally designed in the beginning, rather than something that's going to be refactored into.

