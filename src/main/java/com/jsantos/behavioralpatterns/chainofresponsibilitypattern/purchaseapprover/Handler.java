package com.jsantos.behavioralpatterns.chainofresponsibilitypattern.purchaseapprover;

/**
 * 2 key things in this class:
 *      * it contains a successor and a setter for the successor
 *      * it contains an abstract method to handle the request
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * This defines the contract between the different links in the chain of responsibility.
     * @param request
     */
    public abstract void handleRequest(Request request);
}
