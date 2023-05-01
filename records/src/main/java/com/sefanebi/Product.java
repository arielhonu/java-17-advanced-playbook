package com.sefanebi;

import static com.sefanebi.Validation.checkThat;

public record Product(long id, String name, String description) {

    // The compiler translates this to a final class
    // with private final fields for the components

    // The compiler generates a constructor that initializes the fields

    // The compiler generates accessor methods:
    // public long id() { return this.id; }
    // public String name() { return this.name; }
    // public String description() { return this.description; }

    // Instance fields are not allowed
    // private int value;

    // Static fields are allowed & can even be mutable
    private static int VALUE = 23;

    public Product {
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
    }

    public Product(long id, String name) {
        this(id, name, null);
    }

    public boolean hasDescription() {
        return description != null && !description.isBlank();
    }
}
