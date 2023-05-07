package com.sefanebi;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class LambdasExample04 {

    public static void main(String[] args) {
        var names = List.of("Joe Smith", "Susan Miller", "Will Johnson");

        try (FileWriter out = new FileWriter("names.txt", StandardCharsets.UTF_8)) {
            for (String name : names) {
                out.write(name + "\n");
            }

            names.forEach(name -> {
                try {
                    out.write(name + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e); // Wrap it in an unchecked RuntimeException - Not recommended
                }
            }); // prefer a plain old for-loop in such cases

        } catch (IOException | RuntimeException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
} // Working with Checked Exceptions
