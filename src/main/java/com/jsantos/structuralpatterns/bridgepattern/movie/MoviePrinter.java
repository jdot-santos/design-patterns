package com.jsantos.structuralpatterns.bridgepattern.movie;

import java.util.Arrays;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;

    // uses composition
    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    protected String getHeader() {
        return movie.getClassification();
    }

    protected List<Detail> getDetails() {
        return Arrays.asList(
            new Detail("Title", movie.getTitle()),
            new Detail("Year", movie.getYear()),
            new Detail("Runtime", movie.getRuntime())
        );
    }
}
