# What is the proxy pattern?

The proxy pattern is a pattern that acts as an interface to something else. It can be used to solve multiple problems such as security or simplifying an interface to something, a remote service call, or just an expensive object to create. 

The proxy itself is called to access the real object. 

The proxy pattern can also add more functionality to the wrapped object. 

One thing that people often think of when thinking about the proxy pattern is that it's a great way to implement lazy loading. That's true, there's other applications for the proxy pattern -- like intercepting calls and doing some logic. 

# What are some examples of the Proxy Pattern in the Java world?

* `java.lang.reflect.Proxy` is a mechanism to facilitate creating proxy patterns. Many popular frameworks are built with `java.lang.reflect.Proxy`, such as Spring or Guice. 

* Another example is the whole `java.rmi.*` package, where it's focus surrounds proxying and remote method invocation. This package is all about accessing remote objects and retrieving that data across the wire. 

* Various dependency injection frameworks.

# How do you design the proxy pattern?

The core of the pattern is an intermediary object that intercepts calls, this mostly means that it's interface-based. Java provides an interface (AKA the `InvocationHandler`) and `java.lang.reflect.Proxy` to facilitate this. 

## UML Diagram

