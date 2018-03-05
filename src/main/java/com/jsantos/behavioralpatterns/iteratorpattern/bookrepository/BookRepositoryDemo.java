package com.jsantos.behavioralpatterns.iteratorpattern.bookrepository;

import java.util.Iterator;

/**
 * Represents a demo of a book repository using the iterator pattern
 */
public class BookRepositoryDemo {

    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        // String is used here just to get the point across. It's probably best to use a bike object.
        repo.addBike("Yuba");
        repo.addBike("Cannondale");
        repo.addBike("Co-op");

        Iterator<String> bikeIterator = repo.iterator();

        while(bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        for (String bike : repo) {
            System.out.println(bike);
        }
    }
}
