# What is the strategy pattern?

The strategy pattern is a pattern in which the client is typically aware of the strategies that are available inside the application and typically chooses the strategy during run time. 

The strategy pattern is interface based and there is usually a class per algorithm/strategy. Another feature about the strategy pattern is that it's not aware of the other strategies inside of the application. 

# When would you use the strategy pattern?

You would use the strategy pattern:

* when you want to externalize algorithms inside of the application. 
* when you want to enable the strategy/algorithm to be selected at run time
* when you need to eliminate the conditional statements in the app based on what type of solution was chosen. 
* when you find it difficult to add new strategies inside your app 

# How do you design the strategy pattern?

Some design considerations when implementing the strategy pattern:

* Although strategy patterns can be implemented with an interface, it's typically implemented using an abstract base class. Each concrete class is a different strategy, and the class will implement the algorithm that's unique to that strategy. 
* The strategy pattern should be created in a way where it minimizes/eliminates if/else conditionals from the app.
* The client knows all the strategies, but the strategies don't need to know about each other. 

## UML Diagram

See `uml-diagram_strategy-pattern.png` for a visualization of the UML diagram that makes up the strategy pattern.

* The Context receives the request and determines which strategy to use based on the situation.
* The concrete classes of the Strategy interface are considered a different strategy per class. 


