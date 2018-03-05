# What is the singleton pattern?

The singleton pattern guarantees:

* only one instance is going to be created
* control of a resource

The singleton:

* is responsible for creating itself and managing its lifecycle pattern
* can also be lazy loaded.
* is static in nature, but it's not implemented using a static class typically.  This is because we want singletons to be thread-safe, and the use static classes don't guarantee this. 

# How do I design a singleton pattern?

Based off the UML diagram in `singleton-pattern-uml.png`, the singleton pattern consists of:

* private instance
* private constructor. This is so that the singleton can call the constructor and nobody else
* no parameters. If you need params then you need a factory pattern

# What are real-life examples of the singleton pattern?

In Java-land, some commonly used frameworks are:

* Runtime Environment
* Logger (Although some implementations could be factory instead)
* Spring Beans are by default singletons
* Graphics Managers

Note that `java.util.Calendar` is _not_ a singleton. It's more of a prototype pattern because it returns a new unique instance every time you call its `getInstance()` method.

# What are some of the pitfalls of the singleton?

* They're often overused due to its simplicity, which can mean that developers have a tendency to make everything a singleton when it doesn't necessarily need to be. Your app will be slow if you make everything a singleton
* Singletons can be difficult to unit test due to its private constructor and private member variable nature. 
* Some developers confuse factory pattern with singleton pattern. The key difference is that factory patterns require arguments. 