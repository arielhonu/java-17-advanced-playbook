package com.sefanebi.innerclasses;

public class Example02 {

    public static void main(String[] args) {
        var enclosing = new Enclosing();
        var inner = enclosing.new Inner();
    }
}
