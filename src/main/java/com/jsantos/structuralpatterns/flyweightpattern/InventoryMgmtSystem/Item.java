package com.jsantos.structuralpatterns.flyweightpattern.InventoryMgmtSystem;

/**
 * Item is the implementation of the Flyweight instance, the object that's going to be created a lot.
 * Think of this like Amazon, where if millions of people were to view the same item  and it wasn't in a flyweight-type of implementation -- then it would be very memory-intensive.
 *
 * Created by jsantos on 10/17/17.
 */
public class Item {

    // note that name is final, meaning it's immutable
    private final String name;

    public Item(String name){
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
