package com.sefanebi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasExample03 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Will Johnson");

        var result1 = new ArrayList<String>();
        for (String name : names) {
            result1.add(name.toUpperCase());
        }

        var result2 = new ArrayList<String>();
        names.forEach(name -> result2.add(name.toUpperCase())); // Lambda expression with a side effect

        var result3 = names.stream().map(name -> name.toUpperCase()).toList();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
} // Functional Programing with Lambda Expressions
