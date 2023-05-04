package com.sefanebi.genericsandarrays;


public class Example12 {
    public static void main(String[] args) {
        // Pair<Integer, String>[] pairs = new Pair<Integer, String>[10]; // Error: generic array creation

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Daisy");
        dogs[1] = new Dog("Lucky");

        Animal[] animals = dogs; // Ok because arrays are covariant: Dog[] is a subtype of Animal[]

        animals[0] = new Cat("Luna");

        // The array store check needs runtime type information which is not available for non-reifiable types
        // Therefore, creating arrays with elements of a non-reifiable type is not allowed

        Dog luna = dogs[0]; // Huh?!
    }
}

record Pair<T, U>(T first, U second) {}

interface Animal {}
record Dog(String name) implements Animal {}
record Cat(String name) implements Animal {}

