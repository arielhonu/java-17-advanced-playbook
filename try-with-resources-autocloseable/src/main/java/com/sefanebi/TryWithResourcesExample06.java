package com.sefanebi;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class TryWithResourcesExample06 {

    public static void main(String[] args) {
        try (var tempDir = new TempDirectory("test");
             var out = Files.newBufferedWriter(tempDir.getDirectory().resolve("test.text"), StandardCharsets.UTF_8)) {
            System.out.println("Temporary directory: " + tempDir.getDirectory());
            out.write("Sefanebi");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
