package com.jsantos.structuralpatterns.flyweightpattern.integer;

/**
 * This is a great example of clients not knowing anything unique or what's going on about the valueOf method, and yet it's utilizing the Flyweight pattern.
 *
 * Created by jsantos on 10/17/17.
 */
public class FlyweightWithIntegerDemo {

    public static void main(String[] args) {
        Integer maleahsAge = Integer.valueOf(5);
        Integer monthJourdanAndJamesGotTogether = Integer.valueOf(5);
        Integer monthMaleahWasBorn = Integer.valueOf(10);

        /**
         * identityHashCode is a helper class that retrieves the hash code for this object.
         * When that method calls maleahsAge and monthJourdanAndJamesGotTogether, the hashcode is the same which means that flyweight is in action. When run the first time on maleahsAge, it's creating a hash code and storing it in the literal pool. As it gets to monthJourdanAndJamesGotTogether, it's simply pulling it out of the literal pool/flyweight cache and returning it.
         * When identityHashCode is called on monthMaleahWasBorn, it will have a unique address to the other two.
         */
        System.out.println(System.identityHashCode(maleahsAge));
        System.out.println(System.identityHashCode(monthJourdanAndJamesGotTogether));   // same hashcode as maleahsAge
        System.out.println(System.identityHashCode(monthMaleahWasBorn));                // different hashcode
    }
}
