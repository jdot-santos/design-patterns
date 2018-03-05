package com.jsantos.behavioralpatterns.chainofresponsibilitypattern.purchaseapprover;

/**
 * Represents a basic request in which which handlers will use this in the chain of responsibility pattern.
 */
public class Request {

    private RequestType requestType;
    private double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}
