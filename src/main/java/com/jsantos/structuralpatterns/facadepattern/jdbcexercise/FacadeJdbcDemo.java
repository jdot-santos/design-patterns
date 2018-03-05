package com.jsantos.structuralpatterns.facadepattern.jdbcexercise;

import java.util.List;

/**
 * Created by jsantos on 10/13/17.
 */
public class FacadeJdbcDemo {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();
        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddresses();
        System.out.println("Printing records:");
        addresses.forEach(a -> System.out.println(a.getId() + " " + a.getStreetName() + " " + a.getCity()));
    }
}
