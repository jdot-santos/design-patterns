package com.jsantos.structuralpatterns.flyweightpattern.InventoryMgmtSystem;

/**
 * Created by jsantos on 10/17/17.
 */
public class Demo {

    /**
     * This puts all the flyweight implementation together to show it in action. ims.report() will show that even though this took 11 orders, the flyweight pattern only created/managed 3 Item objects.
     * @param args
     */
    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        // takeOrder() handles the 'cache' layer, but the client can't tell at this level.
        ims.takeOrder("Microfiber Towels", 123);
        ims.takeOrder("Trekz Headphones", 981);
        ims.takeOrder("4K Curved TV", 456);
        ims.takeOrder("Microfiber Towels", 298);
        ims.takeOrder("Microfiber Towels", 789);
        ims.takeOrder("4K Curved TV", 129);
        ims.takeOrder("4K Curved TV", 987);
        ims.takeOrder("Trekz Headphones", 812);
        ims.takeOrder("Microfiber Towels", 654);
        ims.takeOrder("Microfiber Towels", 198);
        ims.takeOrder("Microfiber Towels", 321);

        ims.process();

        System.out.println(ims.report());
    }
}
