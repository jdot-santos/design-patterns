package com.jsantos.structuralpatterns.compositepattern.compsite.meunu.demo;

/**
 * Created by James Santos.
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, String url) {
        this.url = url;
        this.name = name;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
