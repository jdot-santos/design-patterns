# What is the Facade Pattern?
The Facade Pattern enables the developer to provide a simplified interface to a complex system. The main goal for the facade pattern is to simplify an interface or client usage, wrapping complex code with an interface, in order to make it simpler for the end user.  

The facade pattern is a refactoring pattern. This is a pattern that you design down the development road after you realize that an API has some ugly nuances. 

# Why or when would you use the facade pattern?

You'd want to use the facade pattern if you're working with a poorly designed or complex API. 

# What are real-life examples of the Facade Pattern?

`java.net.URL` is an examples from the Java API. 

# How do you design/implement the design pattern?

You can implement the facade pattern in your codebase by utilizing composition. You shouldn't have to use inheritance, and if you do then you should look at a different design pattern.

The facade you're developing can encompass the entire lifecycle of whatever object you're dealing with, but it doesn't necessarily have to in order for it to be considered a facade pattern. 

# What are the pitfalls of the facade pattern?

* You should consider looking at other patterns if you're working with a new API or interface.
* The facade pattern deals with a flat problem/structure
* It's often misused/overused due to how easy it is to implement. 