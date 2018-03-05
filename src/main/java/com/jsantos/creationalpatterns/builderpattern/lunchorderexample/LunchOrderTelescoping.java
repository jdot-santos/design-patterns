package com.jsantos.creationalpatterns.builderpattern.lunchorderexample;

/**
 *
 * This is an alternative to using the builder pattern. Notice the trend here. You can achieve immutability like the builder pattern, but the drawback is that you're going to have a lot of constructors -- especially if you're trying to satisfy certain conditions. I could easily add more constructors to have just meat and dressing, meat/dressing/condiments, etc..
 *
 * Created by jsantos on 12/11/17.
 */
public class LunchOrderTelescoping {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTelescoping (String bread) { this.bread = bread;}

    public LunchOrderTelescoping (String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public LunchOrderTelescoping (String bread, String meat, String condiments) {
        this.bread = bread;
        this.meat = meat;
        this.condiments = condiments;
    }
}
