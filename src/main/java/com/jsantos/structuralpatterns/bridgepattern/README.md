# What is the bridge pattern?
The bridge is similar to the adapter pattern, with the difference being that the Bridge Pattern works with new code while the adapter pattern works with legacy code.

Bridge pattern is meant to decouple abstraction and implementation by using encapsulation, composition, and inheritance. If you do it right, then any changes you make in the abstraction layer won't effect the client -- meaning the client is unaware  of the abstraction on the backend. 

The bridge pattern is designed for uncertainty, and even though it might lead to complex architecture you'll gain more flexibility in your code. 

The bridge pattern is more than just composition -- it uses good OO practices (e.g, abstraction, inheritance, composition) to create the bridge pattern. 
# Why would we use the bridge pattern? 
Using the bridge pattern is good when:
* You know that the details won't be right to begin with.
* you aren't sure what the end product of what you're building will be. 

# Examples of the bridge pattern

Drivers, which is something that we as developers use all the time. A popular driver is the JDBC driver.

# What are the pitfalls of the bridge pattern?

1. *It increases complexity.* A lot of the times, you have to look at the code and see what you have to abstract out. 
2. *It's conceptually difficult to plan.* The code needs to be fairly thought out and it might not lend itself into an agile _code-as-you-go_scenario
3. It's more than just OO, creating the bridge pattern takes more than just knowing what abstraction and inheritance.

