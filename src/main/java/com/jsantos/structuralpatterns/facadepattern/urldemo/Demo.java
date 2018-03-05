package com.jsantos.structuralpatterns.facadepattern.urldemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by jsantos on 10/13/17.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        /*
            You cannot tell, but the URL class is opening and closing connections, making sure things are formatted correctly, handling streams on the back-end, etc.. And what's cool is that all you see is url.openStream()
         */
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
