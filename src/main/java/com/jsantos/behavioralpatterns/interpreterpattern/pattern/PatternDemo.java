package com.jsantos.behavioralpatterns.interpreterpattern.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents a demo using the Pattern API, which is a good example of the Interpreter Pattern
 *
 * One thing to note: the interpreter pattern is only about ESTABLISHING A GRAMMAR. It doesn't care how to parse the grammar.
 */
public class PatternDemo {

    public static void main(String[] args) {

        // create a sentence
        String input = "Lions, and tigers, and bears! Oh, my!";

        // establish grammar for the sentence
        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
        Matcher m = p.matcher(input);

        // output what we found. The interpreter pattern doesn't tell us how to parse the sentence
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
