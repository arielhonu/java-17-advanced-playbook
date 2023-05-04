package com.sefanebi.genericswithvariableargs;

import java.util.HashMap;
import java.util.Map;

public class Example13 {

    static void printLines(String... lines) {
        for (String line: lines) {
            System.out.println(line);
        }
    }


    @SafeVarargs
    static <T, U> void putIntoMap(Map<? super T, ? super U> map, Pair<? extends T, ? extends U>... pairs) {
        for (var pair : pairs) {
            map.put(pair.first(), pair.second());
        }

        Object[] array = pairs; // Allowed because arrays are covariant
        array[0] = new Pair<Long, Long>(2L, 3L); // The array store check will not be able to check this type -> Heap pollution
    } // FYI simply avoid this!

    public static void main(String[] args) {
        printLines("Hello World", "How are you?");
        printLines(new String[]{"Hello World", "How are you?"});

        var map = new HashMap<Integer, String>();

        // The compiler creates an array of the non-reifiable type Pair<Integer, String> !!!
        putIntoMap(map, new Pair<>(1, "one"), new Pair<>(2, "two"));
    }
}

record Pair<T, U>(T first, U second) {}
