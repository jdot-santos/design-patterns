package com.jsantos.structuralpatterns.adapterpattern.arraysaslist;

import java.util.Arrays;
import java.util.List;

/**
 * This is a demo of the Arrays.asList() method, which is an implementation of the adapter pattern.
 * Arrays.asList() is an adapter because it's adapting functionality rather than adding or decorating the class.
 *
 * Created by jsantos on 9/12/17.
 */
public class ArraysAsListDemo {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[] {10, 8, 12};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
