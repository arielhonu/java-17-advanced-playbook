package com.sefanebi;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Random;

public class OptionalExample01 {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Optional<Product> optional = findProductById(269912L);

        Optional<Product> optional2 = Optional.ofNullable(getProductById(238461L));

        if (optional.isPresent()) {
            Product product = optional.get(); // Get the Product out of the Optional
            System.out.println("Found product: " + product);
        } else {
            System.out.println("Product not found");
        }

        Product product1 = optional.orElse(null);
        System.out.println("Product: " + product1);

        Product product2 = optional.orElseGet(() -> Product.PRODUCTS.get(RANDOM.nextInt(Product.PRODUCTS.size())));
        System.out.println(product2);

        Product product3 = optional.orElseThrow(() -> new IllegalStateException("Product not found"));
        System.out.println(product3);
    }


    private static Product getProductById(long productId) {
        for (Product product : Product.PRODUCTS) {
            if (product.id() == productId) {
                return product;
            }
        }

        return null; // No product with the specified product id
    }

    private static Optional<Product> findProductById(long productId) {
        for (Product product : Product.PRODUCTS) {
            if (product.id() == productId) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
