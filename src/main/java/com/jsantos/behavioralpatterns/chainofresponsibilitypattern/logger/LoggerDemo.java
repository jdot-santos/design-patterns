package com.jsantos.behavioralpatterns.chainofresponsibilitypattern.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  This shows a real life example of the of the chain of responsibility pattern in action.
 */
public class LoggerDemo {

    private static final Logger logger = Logger.getLogger(LoggerDemo.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINER);
        addHandler();
        logDifferentStatements();
    }

    /**
        Log at different levels to confirm which log levels will be captured.
        Given the handling logic in addHandler(), the `FINER` level of logging and below will be captured in the console.
     */
    private static void logDifferentStatements() {

        logger.finest("The finest level of logging");   // this one won't print because no one is set to handle FINEST logging requests
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but the less 'fione' as finer or finest");
    }

    /**
     *  Adds a console handler that enables us to see logging statements on the console. This is the concept of 'building the chain' in the chain of responsibility.
     */
    private static void addHandler() {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINER);  // this means anything logged at FINER or lower will be captured by the ConsoleHandler
        logger.addHandler(handler);
    }
}
