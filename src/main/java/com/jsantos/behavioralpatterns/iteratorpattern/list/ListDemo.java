package com.jsantos.behavioralpatterns.iteratorpattern.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Showcases demos of the iterator pattern.
 *
 */
public class ListDemo {

    private static final List<String> CARS = Arrays.asList("bmw", "porsche", "audi");

    public static void main(String[] args) {
        iteratorVariation1();
        iteratorVariation2();
        forLoopExample();
    }

    private static void iteratorVariation1() {
        List<String> names = new ArrayList<>();

        names.add("James");
        names.add("Jourdan");
        names.add("Maleah");

        Iterator<String> namesItr = names.iterator();

        while(namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }

        System.out.println("Names size: " + names.size());
    }

    /**
     * This method uses a foreach loop, which actually uses an instance of an iterator.
     */
    private static void iteratorVariation2() {
        // this uses an iterator behind the scenes.
        for (String car : CARS) {
            System.out.println(car);
        }

        System.out.println("Cars size: " + CARS.size());
    }

    /**
     * Example of using a for loop to print the list of CARS.
     *
     * Although this works in this situation, a for loop will not work if CARS were a Set instead of a List. This is where the Iterator has the advantage, because by utilizing the iterator either by iteratorVariation1 or iteratorVariation2, you're able to iterate over Lists, Sets, and other collections.
     */
    private static void forLoopExample() {
        for (int i = 0; i < CARS.size(); i++) {
            System.out.println(CARS.get(i));
        }
    }
}
