package com.jsantos.creationalpatterns.factorymethodpattern.websiteexample;

/**
 * Represents a Blog type of website for our demo.
 *
 * Notice that the concrete classes are concerned with how the website is created, not the base class.
 * Created by jsantos on 1/8/18.
 */
public class Blog extends Website {

    @Override
    public void createWebsite() {
        // note that we're adding pages that's specific to the blog
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
