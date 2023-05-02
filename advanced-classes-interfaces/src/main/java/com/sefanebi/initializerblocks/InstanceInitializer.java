package com.sefanebi.initializerblocks;

import java.util.Random;

public class InstanceInitializer {
    private final byte[] randomBytes;

    {
        randomBytes = new byte[16];
        new Random().nextBytes(randomBytes);
    }

    public static void main(String[] args) {
        var obj = new InstanceInitializer();
        for (byte b : obj.randomBytes) {
            System.out.printf("%02X ", b);
        }
        System.out.println();
    }
}
