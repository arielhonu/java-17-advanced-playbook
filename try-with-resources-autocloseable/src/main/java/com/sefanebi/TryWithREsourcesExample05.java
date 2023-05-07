package com.sefanebi;

public class TryWithREsourcesExample05 {

    public static void main(String[] args) {
        try (var r1 = new ExampleResource("1"); var r2 = new ExampleCloseThrowsResource("2")) {
            System.out.println("Inside the try-block");
            throw new Exception("Exception thrown in try-block");
        } catch (Exception e) {
            System.out.println("Inside the catch-block");
            e.printStackTrace(System.out);

            Throwable[] suppressed = e.getSuppressed();
        }
    }
}
