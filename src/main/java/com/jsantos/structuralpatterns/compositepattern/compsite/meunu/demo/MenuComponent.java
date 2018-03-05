package com.jsantos.structuralpatterns.compositepattern.compsite.meunu.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the root/start of our component hierarchy
 *
 * Created by James Santos.
 */
public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    /**
     * The add() and remove() method doesn't need to be added here for this demo to be a composite pattern.
     *
     * By adding this though, we add in features to our root/start of the hierarchy that data structures using this object don't necessarily have to use. If they want to utilize the methods, they would simply Override the methods, like what Menu did.
     */
    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
}
