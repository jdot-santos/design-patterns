# What is the proxy pattern?

The proxy pattern is a pattern that acts as an interface to something else. It can be used to solve multiple problems such as security or simplifying an interface to something, a remote service call, or just an expensive object to create. 

The proxy itself is called to access the real object. 

The proxy pattern can also add more functionality to the wrapped object. 

One thing that people often think of when thinking about the proxy pattern is that it's a great way to implement lazy loading. That's true, there's other applications for the proxy pattern -- like intercepting calls and doing some logic, possibly go out to a remote server and return that instance in there and not have to have all the code cluttered inside your object or how it gets handled. 

# When would you want to use the proxy pattern?

Use cases that the proxy pattern can solve can be:
* security
* simplifying an interface
* intercepting a call and go out to a remote server
* expensive object creations
* a great way to implement lazy loading, which at minimum this pattern can do that.

# What are some examples of the Proxy Pattern in the Java world?

* `java.lang.reflect.Proxy` is a mechanism to facilitate creating proxy patterns. Many popular frameworks are built with `java.lang.reflect.Proxy`, such as Spring or Guice. This is a great utility built into the Java API.  

* Another example is the whole `java.rmi.*` package, where it's focus surrounds proxying and remote method invocation. This package is all about accessing remote objects and retrieving that data across the wire. 

* Various dependency injection frameworks, such as Spring and some parts of Hibernate.

# How do you design the proxy pattern?

The core of the pattern is an intermediary object that intercepts calls, this mostly means that it's interface-based. Java provides an interface (AKA the `InvocationHandler`) and `java.lang.reflect.Proxy` to facilitate this. 

## UML Diagram

The *Client* is going to make a reference call to to some *Subject*. Rather than retrieving the real subject, or *RealSubject* in the diagram, it's going to be intercepted with a *Proxy*.
* Client - makes a reference call to a Subject, but rather than retrieving the RealSubject that it wants, the Proxy is going to intercept the call. 
* Subject - an interface to whatever the implementation class that we want to retrieve
* Proxy - intercepts the call from the Client and can do things like: 1) call to the RealSubject or 2) in the case of security would deny it or 3) see if it needs to load another object or 4) check if it needs to pull something from a cache and return that. In java land, the Proxy uses an InvocationHandler and the Proxy class.
* RealSubject - the real object that the Proxy will return to the client.

Subject - an interface to the implementation class that the client wants to retrieve.  
Proxy - intercepts the call and makes the call to the *RealSubject*. It can also return a cached version of it, check security params, etc.. The end call is Proxy returning a RealSubject back to the client. 

# Pitfalls

## you can only have one proxy

This means that implementing stuff like security and auditing will have to be done in that one proxy. 

## This adds another layer of abstraction
This is not bad in some ways, but it could potentially be bad if you're working with things like remote proxies. If the client thinks it's accessing a local resource but instead it's actually remote, then you might retrieve errors you wouldn't expect. 

## Similar to other patterns

It can be hard to identify a pattern if you aren't familiar with the alternatives that you need to proxy instead of a decorator or adapter for example. 
* You're limited to adding security, remote server calls, expensive object creation, etc.. in that one proxy instance. You cannot separate the proxy out.
* It adds another abstraction layer
* It's similar to other patterns, like the decorator or an adapter depending on the use case. This makes it difficult to choose the proxy pattern at times. 