# What is the iterator pattern?

The iterator pattern provides efficient navigation without exposing the structure of the object. 

The iterator is interface based, which enables developers to decouple the traversal algorithm from the client. 

The iterator handles the navigation in an order that best represents its sequence. 

The iterator doesn't expose an index, and the iterator helps with concurrent modification by failing fast in case an event were to occur (e.g., two things trying to modify the collection at the same time). 

# When would you use the iterator pattern?

When you need to traverse a container. 

# How do you design the iterator pattern?

Below are some design considerations:

* The iterator is interface based. An iterable object will provide a method to return an instance of an iterator. The way it returns an iterator resembles a factory method pattern. 

* Each iterator is developed in such a way where they're independent of another, meaning iterators don't know about other iterators.

* Iterators fail fast. An error is thrown if more than one iterator attempts to modify the same object.

# What are the pitfalls of using the Iterator pattern?

* No access to an index - You cannot get an element at a certain position without iterating through and stopping on the object itself.
* The base iterator from Java only allows you to go forward, meaning it's uni-directional -- although the ListIterator allows you bidirectional access.
* In most cases, the iterator is the most efficient way to loop through an object (i.e., looping through large instances). There are some cases where the iterator is slower than using an index and looping through it. 