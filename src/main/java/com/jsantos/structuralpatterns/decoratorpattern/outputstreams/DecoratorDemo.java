package com.jsantos.structuralpatterns.decoratorpattern.outputstreams;

import java.io.*;

/**
 * The InputStream class utilizes decorators to build out its functionality.
 *
 * Output streams are built the way they are so that you can daisy chain functionality onto different streams without having to have a specific instance of each class building that out.
 *
 * In the example below, an {@link OutputStream} cannot write files alone, so we use the {@link FileOutputStream} to do that. And since the FileOutputStream doesn't know how to write data, we use {@link DataOutputStream} to do that, which goes through OutputStream.
 * Created by jsantos on 10/12/17.
 */
public class DecoratorDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();

        // OutputStream is the base decorator FileOutputStream is one of the instances of a ConcreteDecorator in the UML diagram
        OutputStream outputStream = new FileOutputStream(file);

        // Passing the FileOutputStream instance into a DataOutputStream in order to write physical data out to the system.
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("I'm writing to a file!");

        dataOutputStream.close();
        outputStream.close();
    }
}
