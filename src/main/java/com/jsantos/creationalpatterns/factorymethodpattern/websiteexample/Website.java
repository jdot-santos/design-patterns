package com.jsantos.creationalpatterns.factorymethodpattern.websiteexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a websites. Note that createWebsite is the crux of the factory method pattern. This means that it doesn't (and shouldn't) have nothing to do with creating a website -- it relies on the implementing classes to do that work for us.
 *
 * Created by jsantos on 1/8/18.
 */
public abstract class Website {

    /**
     * Acts as a holder of the pages that we're going to create.
     */
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    /**
     * This is the crux of the factory method pattern.
     * All of the concrete classes that implement {@link Website} will have to override this method to generate their respective websites.
     */
    public abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
