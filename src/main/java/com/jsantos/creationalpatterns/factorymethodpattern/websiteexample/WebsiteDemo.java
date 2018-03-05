package com.jsantos.creationalpatterns.factorymethodpattern.websiteexample;

/**
 * This is an example of a basic website generator, where it builds canned web pages based on preferences.
 *
 * Created by jsantos on 1/8/18.
 */
public class WebsiteDemo {

    /**
     * This builds a blog and a shop-type of website
     * @param args
     */
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }

}
