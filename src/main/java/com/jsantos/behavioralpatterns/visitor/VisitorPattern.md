# What is the visitor pattern?

The Visitor pattern focuses on adaptability through externalizing changes, meaning the ability to add functionality without changing the base API of application. The visitor pattern is a great way to separate an algorithm from an object structure.

# When would you want to use this?

You would consider using the visitor pattern when you want to separate the algorithm from an object structure and maintain the open/closed principle of the design. 

The main reason why the visitor pattern might be used is if you're expecting a lot of changes and/or a lot new features and you cannot modify the existing object structure that you've already created.

# What are some examples?

* java.lang.model.element.Element and the ElementVisitor, but they're typically used for the internals of the Java language itself and processing how the language gets compiled and interpreted.

# How do you design this?

The Visitor pattern is interface-based and developers must design around the visitor from the beginning -- it's hard to retrofit after the fact.

The application has _Elements_, which is a piece that is expected to change and add functionality to over time. To add the change, you must implement a Visitor in each of the Elements. Each Element has a _visit_ method and each Visitor knows of every Element.

## UML Diagram

> See `visitor-pattern-uml-diagram.png` for more info

`Client` - The client creates Elements
`Element` -  The interface
`ConcreteElement` - All elements are some form of a ConcreteElement, which is where the pattern and abstraction of the algorithm comes into play. You don't add functionality here.
`Visitor` - An interface that has an accept(ConcreteElement) method for each type of Element that we want to interact with.
`ConcreteVisitors` - The types of visitors developers want to create. There can be multiple ConcreteVisitors, which is encouraged. 