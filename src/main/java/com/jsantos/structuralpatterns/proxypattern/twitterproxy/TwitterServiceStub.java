package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

/**
 * Created by jsantos on 10/18/17.
 */
public class TwitterServiceStub implements TwitterService {
    public String getTimeline(String screenName) {
         return "My awesome timeline";
    }

    public void postToTimeline(String screenName, String message) {

    }
}
