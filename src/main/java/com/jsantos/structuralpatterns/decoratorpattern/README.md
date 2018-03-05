# What is the Decorator Pattern?

The decorator pattern is a hierarchical-type pattern that builds functionality at each level while using composition from similar data types.

The decorator pattern can add behavior to an object without effecting other parts of the hierarchy if you don't want to. Although this pattern is inheritance based, , you should think of this pattern as more than just inheritance since you're controlling which pieces compliment your object instead of simply overriding it.

The decorator pattern is an alternative to subclassing and follows the *single responsibility principle* (Typically subclassing is meant to completely rewrite or extend the parent class). 

The pattern also allows you to compose behavior dynamically by using one of the subclasses that decorate your object. Although this sounds like a creational pattern, we're simply adding behavior through creations so it's considered a structural design pattern.

# Design Considerations

The decorator pattern utilizes composition and is inheritance-based.

When using the decorator pattern, the constructor request an instance of the component from the hierarchy. This enables it to build upon the hierarchy and use composition rather than using inheritance to override which individual fields that it wants to. 

# When would you use the decorator pattern?

If you want to wrap another object to add functionality to it. 

# What are some examples of the decorator pattern?

java.io.InputStream classes

# What are the pitfalls of the Decorator Pattern?

With the decorator pattern, you have to build a new class for every feature you want to decorate. Because the decorator pattern requires the developer to implement a new decorator rather than extending the concrete object, they end up with a lot of tiny specialized objects. ss

The decorator pattern is often confused with simple inheritance. Decorators gives developers a way to add functionality without creating concrete objects for every feature that we want to implement -- a decorator shouldn't mess up the hierarchy of the concrete objects (AKA change the base object) 

# UML Diagram Description

See decoratorpatttern_uml-diagram.png for the image.

The *Component* class is typically an interface, although it can be an abstract class. It has a concrete instance represented by *ConcreteComponent*. It's the ConcreteComponent class that's going to be decorated, and the Decorator is the base decorator/wrapper that will be extended to create other decorators.  

You can then create multiple *ConcreteDecorator* type of classes to decorate your object and provide functionality as you develop. 