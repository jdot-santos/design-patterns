package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

/**
 * Created by jsantos on 10/18/17.
 */
public interface TwitterService {
    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);
}
