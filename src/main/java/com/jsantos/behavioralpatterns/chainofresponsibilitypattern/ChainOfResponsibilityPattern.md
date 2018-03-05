# What is the Chain of Responsibility Pattern?

The chain of responsibility is a behavioral pattern that decouples a request from a handling object in a chain of handlers until it's finally recognized. It's hierarchical in nature and can be configured at runtime.

In the chain of responsibility pattern, the sender doesn't know who the receiver was in order to process the request. 

The pattern requires that the sender has a reference to the next receiver AKA the successor. Because the pattern doesn't know about other commands surrounding it, it will need to pass the call on to its successor if it needs to.  

# When would you want to use the Chain of Responsibility pattern?

You would want to use the pattern whenever you want to decouple the sender and receiver objects -- in other words, promote loose coupling. We can alter the chain by adding links to it without rewriting large portions of the logic in the application. 

# How do you create the Chain of Responsibility pattern?

The chain of responsibility contains a chain of receiver objects, which can be implemented in a list or other types of data structures. 

Each handler is based off a main Handler interface that defines the contract between each chain link.  This interface is the abstraction for all links in the chain. 

There are multiple concrete handlers for each link in the chain. The key part of this pattern is the successor. The handler will pass the request to the successor (AKA next handler) in the chain if it either:

* doesn't know how to process the request
* needs to continue to pass the request along to other parts of the application.

See `uml-diagram_chain-of-responsiblity-pattern.png` for a visualization of the UML diagram. 

# What are some examples of the Chain of Responsibility Pattern?

Some examples in the Java API include:

* java.util.logging.Logger
* Servet API

Another good example of the pattern used is how Spring implements security chain filters in Spring Security.

# What are the pitfalls of the Chain of Responsibility pattern?

* The application doesn't guarantee that a handler along the chain will handle the request, which is a reflection of the runtime configuration. 
* This also means that some configurations may not be tested and some handlers might not get processed. 
* The chain can get increasingly large, which might affect performance. This isn't a problem most of the time, but it's worth noting and keeping an eye out for. 