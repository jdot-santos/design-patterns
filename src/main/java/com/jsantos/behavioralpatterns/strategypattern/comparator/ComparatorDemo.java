package com.jsantos.behavioralpatterns.strategypattern.comparator;

import java.util.*;

/**
 * This class shows an everyday example of how a developer can use the strategy pattern.
 *
 * In this demo, the Strategy interface is the Comparator interface and the concrete implementations are the lambda functions
 *
 * Note a couple things:
 *      * We can easily swap out how we want the list sorted
 *      * The client knows about the different strategies.
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        Person james = new Person("James", "206-555-8982", 30);
        Person jourdan = new Person("Jourdan", "206-555-4180", 28);
        Person maleah = new Person("Maleah", "206-555-1012", 5);

        List<Person> people = Arrays.asList(james, jourdan, maleah); // is this way better than just instanciating an Arraylist? What does asList do anyways?

        System.out.println("Not sorted");
        printContents(people);

        /* below is the same as
        people.sort((p1, p2) -> {
            if (p1.getAge() > p2.getAge()) {
                return 1;
            }
            if (p1.getAge() < p2.getAge()) {
                return -1;
            }
            return 0;
        });
        */
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("\nSorted by age");
        printContents(people);

        /*
            below is the same as
            people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        */
        people.sort(Comparator.comparing(Person::getName));

        System.out.println("\nSorted by name");
        printContents(people);
    }

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

}
