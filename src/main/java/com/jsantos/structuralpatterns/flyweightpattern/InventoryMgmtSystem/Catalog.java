package com.jsantos.structuralpatterns.flyweightpattern.InventoryMgmtSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * Catalog acts as a factory and cache for the Item flyweight objects
 *
 * Created by jsantos on 10/17/17.
 */
public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    /*
        This is the factory method
     */
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
