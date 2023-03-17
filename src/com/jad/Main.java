package com.jad;

import com.jad.smellycheese.*;

public class Main {

    public static void main(String[] args) {
        Building efrei = new Building();
        efrei.addPerson(new Teacher("JAD"));
        efrei.addCheese(new Camenbert());
        efrei.addCheese(new Camenbert());
        efrei.addCheese(new Camenbert());
        efrei.addCheese(new Munster());
        for(Cheese cheese : efrei.getCheeses()) {
            System.out.println( cheese.smell());
        }

        System.out.println(efrei.getPersons().get(0).getName() + " " + efrei.getPersons().get(0).getWorkEfficiency());
    }
}
