package com.jad.smellycheese;

public class Camenbert extends Cheese {
    public Camenbert() {
        super("Camenbert");
    }

    @Override
    public int smell() {
        return -5;
    }
}
