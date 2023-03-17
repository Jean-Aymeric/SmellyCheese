package com.jad.smellycheese;

public class Munster extends Cheese {
    public Munster() {
        super("Münster");
    }

    @Override
    public int smell() {
        return -15;
    }
}
