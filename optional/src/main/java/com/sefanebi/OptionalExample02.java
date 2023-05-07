package com.sefanebi;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class OptionalExample02 {

    public static void main(String[] args) {
        Optional<Product> optional = findProductById(269912L);

        optional.ifPresent(product -> System.out.println("Found product: " + product));

        optional.ifPresentOrElse(
                product -> System.out.println("Found product: " + product),
                () -> System.out.println("Product not found"));

        String text = optional.map(Product::name).orElse("Product not found");
        System.out.println(text);

        Set<Long> discountedProductIds = Set.of(923569L, 404019L, 269912L, 837481L, 947848L, 28983L, 377290L);
        System.out.println(optional
                .filter(product -> discountedProductIds.contains(product.id()))
                .map(product -> "Discounted product: " + product.name())
                .orElse("No discounted product"));

        Set<Long> productIds = Set.of(485845L, 236839L, 100178L, 592496L, 476371L, 373279L, 295695L, 199192L);
        List<Product> products = productIds.stream()
                .map(OptionalExample02::findProductById) // Stream of Optional of Product
                .flatMap(Optional::stream)
                .toList();

        products.forEach(System.out::println);
    }

    private static Optional<Product> findProductById(long productId) {
        return Product.PRODUCTS.stream().filter(product -> product.id() == productId).findFirst();
    }
} // Functional Programming with Optional
