package com.jad.smellycheese;

public abstract class Cheese {
    private String name;

    public Cheese(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract int smell();

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                '}';
    }
}
