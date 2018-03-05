package com.jsantos.structuralpatterns.flyweightpattern.InventoryMgmtSystem;

/**
 * Created by jsantos on 10/17/17.
 */
public class Order {

    private final int orderNumber;
    private final Item item;

    Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNumber);
    }
}
