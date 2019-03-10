package com.jsantos.behavioralpatterns.mediatorpattern.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * This shows how to implement a Timer object and schedule some tasks
 */
public class TimerDemo {

    private Timer timer;

    /**
     * This creates a Timer class and schedule several TimerTask concrete classes.
     * The mediator is the Timer class and it's schedule method.
     * @param seconds
     */
    public TimerDemo(int seconds) {
        timer = new Timer();

        /*
            Using the Timer's schedule() method allows the two classes, RemindTask and
            RemindTaskWithCancel, not to know about one another. The mediator handles everything.
          */
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithCancel(), seconds * 2 * 1000);
    }

    /**
     * Note that this is developed so that this TimerTask instance can run independently of other
     * TimerTask instances. There's no hard-coded references to each other in these classes.
     * To see where these classes are used and handled, see the TimerDemo constructor.
     */
    class RemindTaskWithCancel extends TimerTask {
        @Override
        public void run() {
            System.out.println("Now Time's really up!");
            timer.cancel();
        }
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up!");
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new TimerDemo(3);
        System.out.println("Task scheduled");
    }
}
