package com.sefanebi;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesExample02 {

    public static void removeEmptyLInes(String inputFileName, String outputFileName) throws IOException {

        try (BufferedReader in = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
            BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8))) {

            String line;
            while ((line = in.readLine()) != null) {
                if(!line.trim().isEmpty()) {
                    out.write(line);
                    out.write(System.lineSeparator());
                }
            }
        }
    }
} // A better way
