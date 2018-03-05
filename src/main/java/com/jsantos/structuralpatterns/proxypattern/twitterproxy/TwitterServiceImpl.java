package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

/**
 * This is copied from https://gist.github.com/bh5k/73a82d64e35e780150d1
 *
 * Created by jsantos on 10/18/17.
 */
public class TwitterServiceImpl implements TwitterService {

    private static final String TWITTER_CONSUMER_KEY = "KEKg7aXteZde0bH0utNJrdl6t";
    private static final String TWITTER_SECRET_KEY = "sNozBh7m8StPFsBIu8v1zdk2I3htqO9cJMTGcalogyuvrkk2Dy";
    private static final String TWITTER_ACCESS_TOKEN = "17720825-epiYZi1GeYx40NW61twUIc2lQCR9TkydbyX6CpTYc";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "aI6btHuhpgz3Ek4YPxZKNzyDhKTWJe9y4dLOYc0CC9iE1";

    @Override
    public String getTimeline(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        //we aren't going to allow this
        System.out.println("Not actually going to post this message... " + message);
    }
}
