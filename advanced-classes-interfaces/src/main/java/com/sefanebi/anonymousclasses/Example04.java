package com.sefanebi.anonymousclasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example04 {

    public static void main(String[] args) {
        var names = new ArrayList<>(List.of("Joe", "Susan", "John", "Louise"));

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return Integer.compare(first.length(), second.length());
            }
        });

        names.sort(Comparator.comparingInt(String::length));
        // prefer this especially when implementing a functional interface

        System.out.println(names);
    }
}
