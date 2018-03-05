package com.jsantos.behavioralpatterns.chainofresponsibilitypattern.purchaseapprover;

/**
 * Responsible for running a demo of the chain of responsibility pattern using the purchase approver logic implemented in this package.
 *
 * This is a good example of letting the lowest level handler handle the request and that handler will propagate that request up the chain of responsibility if it has to.
 *
 * Although this is properly setup so that the request will always be caught and processed, you can see that this way of implementing doesn't guarantee that the request will be caught.
 */
public class PurchaseApproverDemo {

    public static void main(String[] args) {

        // the Director, VicePrez, and Ceo objects are all of type Handler
        Director maleah = new Director();
        VicePrez james = new VicePrez();
        Ceo jourdan = new Ceo();

        setupHierarchy(maleah, james, jourdan);

        Request request = new Request(RequestType.CONFERENCE, 500);
        maleah.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        /*
            You can very well do james.handleRequest() and generate the same results. Calling it with maleah makes sense because it utilizes the chain of responsibility. In the Director logic, it won't know how to handle this request so it will send it up the chain to its successor -- which in this case is james.
         */
        maleah.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 5000);
        maleah.handleRequest(request);
    }

    /**
     * Sets up the heirarchy.
     * @param maleah its successor is james
     * @param james its successor is jourdan
     * @param jourdan she's the boss lady
     */
    private static void setupHierarchy(Director maleah, VicePrez james, Ceo jourdan) {
        maleah.setSuccessor(james);
        james.setSuccessor(jourdan);
    }
}
