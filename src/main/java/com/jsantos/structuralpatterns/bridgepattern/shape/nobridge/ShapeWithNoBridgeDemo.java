package com.jsantos.structuralpatterns.bridgepattern.shape.nobridge;

/**
 * Created by jsantos on 9/20/17.
 */
public class ShapeWithNoBridgeDemo {

    /**
     * This is an example of using Shapes without the Bridge pattern
     *
     * The problem with this design is that if you introduce a new color square, let's yellow, then you have to
     * create a YellowSquare class that extends square and implement the applyColor() method. Similar situation occurs
     * if you introduce a new color circle (like a green circle). Even though the process of introducing a YellowSquare class
     * is fairly straightforward in this example, think of code that's a bit more complex than this and applying this same
     * technique.
     *
     * A bigger problem is if you try to introduce a different shape, like a diamond. Then you have to create a Diamond class similar
     * to Square and Circle, then you have to create your RedDiamond, BlueDiamond, GreenDiamond, etc..
     * @param args
     */
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
