# What is the builder pattern?

The builder builder pattern allows for handling of construction objects that may contain a lot of parameters that we'd want to make immutable once done constructing it.

# When would you want to use the builder pattern?

You would want to use this pattern if:
 * You're handling the construction of objects that may contain a lot of parameters
 * you want the object immutable once you're done constructing it. Doing this helps enforce the contract

# How do you build a builder pattern?

The builder is typically written with a static inner class. This is because it typically returns an instance of the object that it's building.

Note that the builder pattern doesn't negate the need for constructors, but rather works in unison with those to call the appropriate constructor based off its state.

# What are the pitfalls of using the builder pattern?

Objects created with the builder are typically designed to be immutable, so it's something that isn't usually refactored after the fact.

It's a little more complex than its alternatives (e.g., constructors or setters)

# What are the alternatives to using the builder pattern?

Some alternatives include:
* Contructors, which can lead to multiple constructors with each parameter variation (AKA telescoping constructor)
* Setters, which doesn't make the object immutable.


# What are some examples of the builder pattern?

Some examples include:
* StringBuilder
* DocumentBuilder
* Locale.Builder