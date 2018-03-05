# What is the adapter pattern?

The adapter pattern allows developers to connect new code to *legacy code* without having to change the working contract that was produced from the legacy code originally. The adapter pattern is almost always *retrofitted* to make unrelated classes work together. 

You can think of an adapter pattern like a universal USB charger that can give charge to one or more different phones

![](2017-09-13-06-08-09.png)

The adapter prattern is created to provide a different interface to legacy code than was originally intended.

# When would you use the adapter pattern?

You would use the adapter pattern if you want to enable a client to talk to an existing interface and the system responsible for the interface is a legacy app or module that a developer doesn't want to or can't possibly change. 

# When would you not use the adapter pattern?

You would not use the adapter pattern if you are adding functionality to the legacy code rather than merely adapting. Patterns like the `decorator pattern` are good solutions for problems like these. 

# What are some real examples of the adapter program

The collections API, more specifically the usage of arrays to lists conversion, is one such example. Arrays could be classified as a legecy API, and lists were the newer part of the collections API intro'd later -- and there's methods in the collection API to adapt arrays to lists.

Another example in the Java API are the stream classes surrounding I/O. Almost all of the stream classes have adapters to work with other streams or readers.

## Example: Arrays.asList()

The `Arrays.asList()` method is an adapter that converts arrays of something into a list from the collections API. `Arrays.asList()` is an adapter paattern because it's adapting functionality rather than adding or decorating the class. 

The Java API also makes good use of generics in `Arrays.asList()` and returns the list as the correct object type without having to specify the type. 

```java
    Integer[] arrayOfInts = new Integer[] {10, 8, 12};
    // Arrays.asList() will return a list of integers given an array of integers
    List<Integer> listOfInts = Arrays.asList(arrayOfInts);
    System.out.println(arrayOfInts);
    System.out.println(listOfInts);
```

# Questions
* How does the Adapter pattern stack up against today's development? Is there something that was introduced recently that doesn't require the use of the adapter pattern anymore? Maybe something from Java8?