package com.jad.smellycheese;

public abstract class Person {
    private String name;
    private int workEfficiency;

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(final Building building) {
        this.building = building;
    }

    private Building building;

    public Person(final String name, final int workEfficiency) {
        this.name = name;
        this.workEfficiency = workEfficiency;
    }

    public String getName() {
        return name;
    }

    public int getWorkEfficiency() {
        return workEfficiency + this.getWorkEfficiencyExtended();
    }

    protected abstract int getWorkEfficiencyExtended();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
