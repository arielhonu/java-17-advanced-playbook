package com.sefanebi;

public final class Validation {

    private Validation() {
    }

    public static void checkThat(boolean expr, String message) {
        if (!expr) {
            throw new IllegalArgumentException(message);
        }
    }
}
