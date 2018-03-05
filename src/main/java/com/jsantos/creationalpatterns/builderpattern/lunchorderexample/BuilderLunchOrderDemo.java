package com.jsantos.creationalpatterns.builderpattern.lunchorderexample;

/**
 * Created by jsantos on 12/10/17.
 */
public class BuilderLunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
