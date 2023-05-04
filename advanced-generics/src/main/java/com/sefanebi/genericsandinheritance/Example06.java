package com.sefanebi.genericsandinheritance;

import java.util.ArrayList;
import java.util.List;

public class Example06 {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Daisy"));
        dogs.add(new Dog("Lucky"));

        // Error! -> Generics are invariant
        // A List that can contain any kind of object of type Animal
        // List<Animal> animals = dogs; // Suppose that this was allowed

        // animals.add(new Cat("Luna")); // Then we could add a Cat to a list of Dogs

        Animal animal = new Dog("Max");

        // A List that can contain objects of a particular, but unknown type that extends Animal
        List<? extends Animal> animals = dogs; // OK

        // animals.add(new Dog("Max"));

    }
}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}
