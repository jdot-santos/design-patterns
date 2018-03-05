# What is the flyweight pattern?

The flyweight pattern is an optimization pattern, minimizing memory use by sharing data with similarly typed objects. Examples of similarly typed objects often include stateless or immutable (objects which their state cannot be changed after creation). `java.lang.String` is an immutable object and is loaded from a string literal pool that's basically a flyweight factory.

The flyweight pattern is a pattern you want to utilize if you know you're going to have a lot of objects that we're going to pass around in our system and don't want to create those for every client or end-user that's going to be accessing them from your system. 

This pattern used a lot by the core API.

# What are real-life examples of the flyweight factory?

Besides `java.lang.String`, there's also `java.lang.Integer` and it's `valueOf()` method, a good example of a flyweight. All of the primitive objects with wrappers (e.g., Boolean, byte, character, short, and long) have a valueOf method that's similar to Integer's that's flyweight in nature. 

### Strings

String are immutable and come out of a literal pool, which is sort of a cache that all strings in the JVM are stored in a retrieved from. 

# How do you design the flyweight pattern?

The flyweight pattern is a pattern of patterns, utilizing the factory pattern and inside of this structural pattern. 

Based off the the UML diagram in `Selection_006.png`, the flyweight consists of the following:

* The flyweight starts with a *Client*, which requests the *Flyweight* object via a *FlyweightFactory*. 
* The *FlyweightFactory* returns the cached object or creates a new instance of the flyweight if one does not exist in its factory. The object returned is a *ConcreteFlyweight* object. This is were the factory pattern comes into play.
* The *ConcreteFlyweight* is what gets returned to the client, although it thinks it's just getting that object back. The client oftentimes does not know the underlying structure and only knows its simple interface. 

# What are some pitfalls of the Flyweight pattern?

* The flyweight pattern can be seen as a complex pattern compared to other structural patterns. 
* This pattern could also lead to premature optimization, which isn't too bad if you're already done a spike or you understand your product/architecture enough to know that you need to optimize up front. You can also implement this after the fact, but it could lead to a lot of refactoring.
* A lot of examples on the internet are graphical examples, but that's not the only place where the Flyweight pattern can be beneficial. You can use this in: any management system, inventory management systems, shopping cart systems, or any systems with a lot of small objects that a lot of people will be utilizing. 
