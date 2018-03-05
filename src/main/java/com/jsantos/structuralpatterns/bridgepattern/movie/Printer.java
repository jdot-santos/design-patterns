package com.jsantos.structuralpatterns.bridgepattern.movie;

import java.util.List;

public abstract class Printer {

    /*
        print(), getHeader(), and getDetails() are the heart of the bridge pattern. They makeup the pieces of our bridge
     */

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract String getHeader();

    protected abstract List<Detail> getDetails();
}
