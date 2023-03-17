package com.jad.smellycheese;

import java.util.ArrayList;

public class Building {
    private ArrayList<Cheese> cheeses;
    private ArrayList<Person> persons;

    public Building() {
        this.cheeses = new ArrayList<>();
        this.persons = new ArrayList<>();

    }

    public void addCheese(Cheese cheese) {
        this.cheeses.add(cheese);

    }

    public void addPerson(Person person) {
        this.persons.add(person);
        person.setBuilding(this);
    }

    @Override
    public String toString() {
        return "Building{" +
                "cheeses=" + cheeses +
                ", persons=" + persons +
                '}';
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
}
