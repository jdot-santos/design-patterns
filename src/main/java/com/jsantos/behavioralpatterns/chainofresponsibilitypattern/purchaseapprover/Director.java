package com.jsantos.behavioralpatterns.chainofresponsibilitypattern.purchaseapprover;

/**
 * This is a basic class that only contains the method necessary to handle a request (since this object is a Handler)
 */
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        /*
        Note that this handles the request if the request type is of type CONFERENCE. This will pass the request to its successor if it can't handle this request, hence the else statement.
         */
        if (RequestType.CONFERENCE == request.getRequestType()) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
