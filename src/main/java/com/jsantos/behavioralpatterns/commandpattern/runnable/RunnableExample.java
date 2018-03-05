package com.jsantos.behavioralpatterns.commandpattern.runnable;

/**
 * Runs a demo of a real-life version of the command pattern.
 *
 * The Thread class is the Invoker of the command pattern.
 */
public class RunnableExample {

    public static void main(String[] args) {
        Task task1 = new Task(10,12);
        Task task2 = new Task(20,30);

        // the invoker
        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
