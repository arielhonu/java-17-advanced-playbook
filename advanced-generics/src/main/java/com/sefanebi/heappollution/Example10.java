package com.sefanebi.heappollution;

import java.util.ArrayList;
import java.util.List;

public class Example10 {

    public static void main(String[] args) {
//        List dogs = new ArrayList<Dog>(); // Watch this!
//        dogs.add(new Dog("Daisy"));
//        dogs.add(new Dog("Lucky"));
//
//        List<Cat> cats = dogs; // Allowed!
//        System.out.println(cats);
//
//        Cat cat = cats.get(0); // ClassCastException

        List<Dog> hounds = new ArrayList<>();
        hounds.add(new Dog("Snowball"));
        hounds.add(new Dog("Black Joe"));

        List<? extends Animal> animals = hounds;

        List<Dog> dogsAgain = (List<Dog>) animals; // Casting to a non-reifiable type: "unchecked" warning

        List<Cat> cats = (List<Cat>) animals; // "unchecked" warning and heap pollution
        Cat cat = cats.get(0); // ClassCastException
    }
}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
