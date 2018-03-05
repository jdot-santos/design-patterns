package com.jsantos.structuralpatterns.bridgepattern.shape.withbridge;

/**
 * There's several things that are different with this demo than in @{@link com.jsantos.shape.nobridge.ShapeWithNoBridgeDemo}'s main method.
 *
 * The colors have been extracted into their own interface and class hierarchy. Shapes are still implemented the same way but are now utilizing composition.
 *
 * This is easy to add new Colors to the shapes. For instance, to intro a black square one would simply implement a Black @{@link Color} and add an instance of that object to the constructor of a @{@link Square}. Doing this won't change the Square object at all. It was abstracted out from the changes of the Colors from the backend. The same can be said to @{@link Circle} if you wanted to create a black circle. 
 *
 * Created by jsantos on 9/20/17.
 */
public class ShapeWithBridgeDemo {

    public static void main(String[] args) {
        Shape square = getBlueSquare();
        Shape circle = getRedCircle();
        Shape greenCircle = getGreenCircle();
        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
    }

    private static Shape getRedCircle() {
        Color red = new Red();
        return new Circle(red);
    }

    private static Shape getBlueSquare() {
        Color blue = new Blue();
        return new Square(blue);
    }

    public static Shape getGreenCircle() {
        Color green = new Green();
        return new Circle(green);
    }
}
