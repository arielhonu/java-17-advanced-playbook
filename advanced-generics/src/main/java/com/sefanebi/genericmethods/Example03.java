package com.sefanebi.genericmethods;

public class Example03 {

    public static void main(String[] args) {
        var p1 = Pair.<Integer, String> of(1, "one");

        var p2 = Pair.of(2, "two");

        var p3 = p2.map((left, right) -> Pair.of(right, left));
    }
}
