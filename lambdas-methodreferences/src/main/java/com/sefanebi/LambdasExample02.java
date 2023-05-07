package com.sefanebi;

import java.util.List;

public class LambdasExample02 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Will Johnson");

        var count = 0;
        for (String name : names) {
            System.out.println(++count + ": " + name);
        }

        // Error: local virable referenced for a lambda expression must be final or effectively final
        // names.forEach(name -> System.out.println(++count + ": " + name));
    }
} // Capturing Local Variables in Lambda Expressions
