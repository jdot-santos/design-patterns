package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

/**
 * Created by jsantos on 10/18/17.
 */
public class TwitterDemo {

    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("trump"));

        service.postToTimeline("trump", "some message that shouldn't go through");
    }
}
