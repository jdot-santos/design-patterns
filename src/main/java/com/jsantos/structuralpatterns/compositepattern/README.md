# What is the Composite Pattern?

A composite pattern generalizes a hierarchical structure which makes it easy for clients to use our data structures. In the CompositeMenuDemo, we build a menu structure that had menu items like leaves and other composites, and the composite pattern helped in navigating the structure easily. It's easy because in the CompositeMenuDemo example, the client handled a Menu class, a sub menu, and a MenuItem class the same way. The same can also be said with data structures like Maps. 

The composite pattern is meant to treat components the same whether it's part of your structure or the whole structure itself. This is done by configuring 
your objects into tree structures. Once built this way, you can treat individual objects the same as a composite object -- which mean we can apply operations or 
functions on both the individual and the composite, and expect themt o work the same way. 

NOTE: A composite is NOT the same as *composition*
# What are some real-world examples of the Composite Pattern?

Examples in the Java API are:

* java.awt.Component, although mostly everything from the java.awt library is built with the composite pattern
* RESTful web services, in particularly, GET services.

# How would you go about designing a structure in a Composite Pattern?

You should think of building something in a composite pattern that's `tree-structured`. The root of the tree starts with the component.

Components are one of two things, either a leaf oÅr a composite of objects. The difference is that a leaf just has operations and a composite has all of the same operations available, but also knows about its child components. 

# Pitfalls

## A composite pattern can over simplify a system. 
By building a hierarchical structure in a composite pattern way, it can make it difficult to restrict what we want to add to it. Just like the CompositeMenuDemo class, you have to rely on checking to see if objects being added can during runtime instead of checking it at compile time. 

# TODO 

* get more examples of the composite pattern because I'm not too convinced that the map example completely explained to me what the composite pattern is. 

