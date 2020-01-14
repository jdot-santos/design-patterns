# What is this pattern?

This is the memento pattern, a pattern used to externalize and capture an object's state. Each state capture is independent, which allows us to do things like:
 * rollback to a different state
 * recreate a specific state in the future

# When would you use this pattern?

If you care about restoring an object to a previous state (i.e., undo, rollback). This is done by externalizing an object's state, so that it can be returned to it later. Be cautious when implementing this pattern, as you can violate encapsulation. 

The nature of the memento pattern is that it shields complex internals from other objects. 

## Examples

### java.util.Date 

A `Date` object is internally represented by a long value. It can be easily returned to a previous state by updating that long value. 

### java.io.Serializable

`Serializable` allows you to implement any object, where its state is recreatable

# How do you design this pattern?

The memento pattern is class based

### Roles 

> See UML diagram of the memento pattern, located at com/jsantos/behavioralpatterns/memento/memento-pattern_uml-diagram.png 

#### Originator

The originator the object we want to create a copy or save point of. It has state, and it also creates a memento of itself.

#### Memento

The Memento represents the copy of the originator that we want to store. It's made up of fields that are required to recreate or copy the state of an object. These combination of fields are often known as a _Magic Cookie_ 

The bits copied from the originator is stored in a memento.

#### Caretaker

The caretaker is what manages the copies of mementos that's created. Its focus is to build a history of an object's state, and can be compared to having a list of UNDOs available in your word processor app.

The caretaker knows why and when the originator needs to be saved, and how to revert.

You can implement this using an ArrayList, a Stack, etc..

# What are the pitfalls of using this pattern?

### Expensive

We can obtain a substantial amount of overhead if the memento makes a large copy of an originator's data.

### Consider History Purging

When implementing the memento pattern, you must:

* Be mindful on purging the history after a given threshold
* Think about how much to store at one time

### Exposing Information

Take precautions to avoid exposing originator information. An originator's state needs to be copied to the memento, but it shouldn't go anywhere else. 
