package com.sefanebi.staticnestedclasses;

import java.time.LocalDate;

public class Enclosing {

    private static int number = 23;
    private static LocalDate date = LocalDate.of(2023, 1, 1);

    private String name = "Joe Smith";

    private static void printNumber() {
        // System.out.println(name);
        System.out.println(number);
    }

    private static void printDate() {
        System.out.println(date);
    }

    private void printName() {
        System.out.println(name);
    }



    static class Nested {
        private LocalDate date = LocalDate.of(2011, 8, 9);

        private void printDate() {
            System.out.println(date);
        }

        void run() {
            System.out.println(date); // date in class Nested
            printDate(); // printDate() in class Nested

            System.out.println(Enclosing.date); // date in class Enclosing
            Enclosing.printDate(); // printDate() in class Enclosing

            // Accessing static members of the enclosing class is OK
            System.out.println(number);
            printNumber();

            // Accessing the instance members of the enclosing class does not work
            // System.out.println(name);
            // printName()
        }
    }
}
