package com.jsantos.behavioralpatterns.iteratorpattern.bookrepository;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String [] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike) {
        checkBikesSize();
        bikes[index] = bike;
        index++;
    }

    /**
     * Increases size of bikes if necessary
     */
    private void checkBikesSize() {
        if(index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
    }

    /**
     * This is the crux of the Iterator pattern.
     * @return an iterable object
     */
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                // ensures that we're in the limits of our array and are inside the bounds of our current index
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                // shorthand for returning the bikes at currentIndex, then incrementing its value by 1
                return bikes[currentIndex++];
            }

            // todo add remove()
        };
    }
}
