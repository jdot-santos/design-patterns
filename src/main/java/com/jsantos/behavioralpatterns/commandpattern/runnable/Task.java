package com.jsantos.behavioralpatterns.commandpattern.runnable;

/**
 * Represents a task.
 *
 * The Runnable interface is the Command interface in the command pattern.
 */
public class Task implements Runnable {
    int num1;
    int num2;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    /**
     * The receiver in this example is the console
     */
    @Override
    public void run() {
        System.out.println(num1 * num2);
    }
}
