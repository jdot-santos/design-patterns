package com.jsantos.structuralpatterns.bridgepattern.movie;

public class BridgeDemo {

    public static void main(String[] args) {
        Movie johnWick = new Movie();
        johnWick.setClassification("Action");
        johnWick.setTitle("John Wick");
        johnWick.setRuntime("2:15");
        johnWick.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(johnWick); // this knows nothing of the PrintFormatter, only Formatter
        String printedMaterial = moviePrinter.print(printFormatter); // this knows nothing of the MoviePrinter, only Printer

        // in order to use a new formatting type, all you do is create a new implementation of a Formatter, which below we created HtmlFormatter
        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter); // note that we don't have to create a new instance of a MoviePrinter

        System.out.println(printedMaterial);
        System.out.println(htmlMaterial);
    }
}
