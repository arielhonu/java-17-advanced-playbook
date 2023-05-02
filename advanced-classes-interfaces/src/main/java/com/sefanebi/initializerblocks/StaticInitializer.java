package com.sefanebi.initializerblocks;

import java.io.IOException;
import java.util.Properties;

public class StaticInitializer {

    private static final Properties CONFIGURATION = new Properties();

    static {
        try {
            CONFIGURATION.load(StaticInitializer.class.getResourceAsStream("/example.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
