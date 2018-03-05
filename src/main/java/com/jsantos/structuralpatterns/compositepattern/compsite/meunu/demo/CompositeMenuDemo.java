package com.jsantos.structuralpatterns.compositepattern.compsite.meunu.demo;

/**
 * Created by James Santos.
 */
public class CompositeMenuDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu= new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaimsMenu);

        /*
            Simply calling mainMenu's toString() method, it navigated through all the structures it added.
            TODO: enable a feature such that printing children will print its entire hierarchical structure, like
                * /main/safety
                * /main/claims/personalClaims
         */
        System.out.println(mainMenu.toString());
    }
}
