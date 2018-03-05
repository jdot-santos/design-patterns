package com.jsantos.structuralpatterns.compositepattern.compsite.meunu.demo;

import java.util.Iterator;

/**
 * Menu is the composite of our UML diagram.
 *
 * Created by James Santos.
 */
public class Menu extends MenuComponent {

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); // using builder pattern
        builder.append(print(this));

        /*
            The following code iterates through all of its children. Being that this is a composite pattern, as a composite,
            the Menu class knows about its children. Each child object structure can be handled the same was as its own leaf.
         */
        Iterator<MenuComponent> itr = menuComponents.iterator();
        while (itr.hasNext()) {
            MenuComponent menuComponent = itr.next();
            builder.append(menuComponent.toString());
        }

        builder.append("\nFull path: ");
        builder.append(getUrl());
        for(MenuComponent child : menuComponents) {
            builder.append(child.getUrl());
        }
        return builder.toString();
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }
}
