package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

/**
 * Initially created to stub Twitter service calls, in order to move faster in initial implementation. You can see that TwitterServiceImpl has the actual implementation.
 */
public class TwitterServiceStub implements TwitterService {
    public String getTimeline(String screenName) {
         return "My awesome timeline";
    }

    public void postToTimeline(String screenName, String message) {

    }
}
