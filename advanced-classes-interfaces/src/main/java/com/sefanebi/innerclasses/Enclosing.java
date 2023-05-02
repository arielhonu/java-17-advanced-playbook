package com.sefanebi.innerclasses;

public class Enclosing {

    private String name = "Joe Smith";

    public void createInner() {
        var inner = this.new Inner();
    }

    class Inner {
        private String name = "Susan Jones";

        void run() {
            System.out.println(name); // Susan Jones
            System.out.println(Enclosing.this.name); // Joe Smith
        }
        // prefer static nested classes over inner classes
        // only switch to inner classes when there's a need for the nested class
        // to have a reference to an instance of its enclosing class

    }
}
