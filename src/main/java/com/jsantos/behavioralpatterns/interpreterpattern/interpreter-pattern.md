# What is the interpreter pattern?

The interpreter pattern is used to represent/define the grammar of a language. This grammar can include music notation, mathematical notation, another language, source code, etc.. It's a great pattern to use if you're defining rules, or validating criteria for objects. The interpreter pattern allows an application to map out a domain specific language. 

The interpreter pattern is seen as a limited-use pattern, as it solves a very specific problem and solves it well -- but is rarely used outside of that problem space. 

The interpreter has the following qualities:
* it has access to properties, because it contains the object
* functions are defined as methods

# When would you want to use the interpreter pattern?

The interpreter pattern should be used:

* When you're defining a particular grammar
* Defining rules for objects
* Validating criteria for objects

# How do you design a interpreter pattern?

The interpreter pattern consists of the components described below. Please see uml-diagram_interpreter-pattern.png for a visual representation.

* AbstractExpression - The AbstractExpression provides the contract for how the application interacts with an expression. It can an abstract class or an interface,  

* TerminalExpression - expressions that can be evaluated in their current form. Represents a leaf of a tree, meaning that it doesn't contain other expressions. 

* NonterminalExpression - contains other expressions and typically calls itself recursively until it's broken down into TerminalExpressions or multiple expressions.

# What are real-life examples of the interpreter pattern?

Examples include:
* java.util.Pattern, which is used to represent a compiled regular expression (AKA regex)
* java.text.Format, an abstract-based class that's used to represent local sensitive content (e.g., dates, numbers, and strings)


# What are the pitfalls to using the interpreter pattern? 

* Complexity - if you implement the pattern where it increases complexity, then it will be difficult to maintain. 
* Class per rule - it's typically the case that you have one class per rule/expression, which means that complex rules will require multiple classes to define them. 
* It solves a specific problem