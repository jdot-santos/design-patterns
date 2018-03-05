# What is the prototype pattern?

The prototype pattern is a classic Gang of Four pattern used when the type of object to be created is determined by a prototypical instance, which is cloned to produce a new instance.

This way of creating objects has performance benefits, which is why this pattern is often a preferred way of creating lots of objects. One of the benefits of this pattern is that it avoids the inherent costs of creating a new object the standard way (e.g., the `new` keyword, which is a major factor for expensive object creations), which means that it obtains objects faster.

This is pattern not often used, but this combined with other possible patterns could lead to an extraordinary solution in your codebase.

# What are some of the key concepts of the prototype pattern?

Here are the following characteristics of the prototype pattern:

* the prototype pattern can be seen as a refactoring pattern, meaning you won't realize you need a pattern like this until after the fact. 
* Prototypes avoid subclassing, meaning you're usually creating an instance of the actual prototype that you're actually working with. 
* Oftentimes, it doesn't use the keyword `new` unless it's the first instance. Subsequent objects are cloned.
* Prototypes are usually implemented with some sort of a registry.  

# How do you implement the prototype pattern?

* The prototype typically implements the clone/cloneable method and interface. Although the clone method is used, each instance will still be unique.
* parameters can be used in the clone method, but often times they're not needed. 
* You must consider if you want a shallow copy versus a deep copy. A shallow copy just copies the immediate properties. A deep copy will do a shallow copy along with any object references, which is preferred especially if you intend copy any non-primitive values. 

# What are the pitfalls to using the prototype pattern?

* Prototypes aren't often used.
* Prototypes are usually combined with other patterns, like ones that utilize a registry. 
* Developers need to consider `shallow copy` vs `deep copy` when implementing the prototype pattern. A deep copy is oftentimes preferred, but requires more coding and people start to second guess the validity of the pattern once you start adding more code to make this work. 
