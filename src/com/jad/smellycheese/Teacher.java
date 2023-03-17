package com.jad.smellycheese;

public class Teacher extends Person{
    public Teacher(final String name) {
        super(name, 100);
    }

    @Override
    protected int getWorkEfficiencyExtended() {
        int result = 0;
        if (this.getBuilding() != null) {
            for(Cheese cheese : this.getBuilding().getCheeses()) {
                result += cheese.smell();
            }
        }
        return result;
    }
}
