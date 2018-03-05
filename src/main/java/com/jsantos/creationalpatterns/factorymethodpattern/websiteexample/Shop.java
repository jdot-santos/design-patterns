package com.jsantos.creationalpatterns.factorymethodpattern.websiteexample;

/**
 * Represents a Shop type of website for our demo.
 *
 * Notice that the concrete classes are concerned with how the website is created, not the base class.
 * Created by jsantos on 1/8/18.
 */
public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
