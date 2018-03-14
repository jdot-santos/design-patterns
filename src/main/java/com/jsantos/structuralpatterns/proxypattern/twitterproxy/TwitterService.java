package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

/**
 * Represents the Subject in the UML diagram.
 * Created by jsantos on 10/18/17.
 */
public interface TwitterService {
    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);
}
