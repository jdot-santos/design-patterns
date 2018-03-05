package com.jsantos.behavioralpatterns.chainofresponsibilitypattern.purchaseapprover;

/**
 * Represents the highest level in the chain. Note that you can add links anywhere in the chain and you don't have to rewrite much logic for the chain to still work.
 */
public class Ceo extends Handler {
    @Override
    public void handleRequest(Request request) {
        /*
            This signifies that it's at the end of the chain since it doesn't send the request to anyone else.
         */
        System.out.println("CEOs can approve anything they want");
    }
}
