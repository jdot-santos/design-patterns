package com.jsantos.behavioralpatterns.chainofresponsibilitypattern.purchaseapprover;

public class VicePrez extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (RequestType.PURCHASE == request.getRequestType()) {
            if(request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
