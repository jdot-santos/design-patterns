# What is the proxy pattern?

The proxy pattern is a pattern that acts as an interface to something else. It can be used to solve multiple problems such as security or simplifying an interface to something, a remote service call, or just an expensive object to create. 

The proxy itself is called to access the real object. 

The proxy pattern can also add more functionality to the wrapped object. 

One thing that people often think of when thinking about the proxy pattern is that it's a great way to implement lazy loading. That's true, there's other applications for the proxy pattern -- like intercepting calls and doing some logic. 

# When would you want to use the proxy pattern?

Use cases that the proxy pattern can solve can be:
* security
* simplifying an interface
* intercepting a call and go out to a remote server
* expensive object creations
* a great way to implement lazy loading, which at minimum this pattern can do that.

# What are some examples of the Proxy Pattern in the Java world?

* `java.lang.reflect.Proxy` is a mechanism to facilitate creating proxy patterns. Many popular frameworks are built with `java.lang.reflect.Proxy`, such as Spring or Guice. 

* Another example is the whole `java.rmi.*` package, where it's focus surrounds proxying and remote method invocation. This package is all about accessing remote objects and retrieving that data across the wire. 

* Various dependency injection frameworks, such as Spring and some parts of Hibernate.

# How do you design the proxy pattern?

The core of the pattern is an intermediary object that intercepts calls, this mostly means that it's interface-based. Java provides an interface (AKA the `InvocationHandler`) and `java.lang.reflect.Proxy` to facilitate this. 

## UML Diagram

* Client - makes a reference call to a Subject, but rather than retrieving the RealSubject that it wants, the Proxy is going to intercept the call. 
* Subject - an interface to whatever the implementation class that we want to retrieve
* Proxy - intercepts the call from the Client and can do things like: 1) call to the RealSubject or 2) in the case of security would deny it or 3) see if it needs to load another object or 4) check if it needs to pull something from a cache and return that. In java land, the Proxy uses an InvocationHandler and the Proxy class.
* RealSubject - the real object that the Proxy will return to the client.

# What are the pitfalls of the Proxy pattern?

* You're limited to adding security, remote server calls, expensive object creation, etc.. in that one proxy instance. You cannot separate the proxy out.
* It adds another abstraction layer
* It's similar to other patterns, like the decorator or an adapter depending on the use case. This makes it difficult to choose the proxy pattern at times. 
