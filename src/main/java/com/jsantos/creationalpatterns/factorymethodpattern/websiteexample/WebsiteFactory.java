package com.jsantos.creationalpatterns.factorymethodpattern.websiteexample;

/**
 * Created by jsantos on 1/8/18.
 */
public class WebsiteFactory {

    /**
     * This is where the factory method pattern steps into play.
     *
     * Note that we don't want clients to be able to access the concrete classes on their own, which is why we specify a siteType.
     * @param siteType
     * @return
     */
    public static Website getWebsite(WebsiteType siteType) {
        switch(siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default:
                return null;
        }
    }
}
