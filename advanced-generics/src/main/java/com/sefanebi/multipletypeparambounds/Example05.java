package com.sefanebi.multipletypeparambounds;

import java.util.Comparator;
import java.util.List;

public class Example05 {

    public static void main(String[] args) {
        var products = List.of(
                new Product(100346L, "Bread", "Whole-wheat loaf"),
                new Product(100252L, "Cheese", "Gouda cheese"),
                new Product(100123L, "Apples", "Tasty red apples"));

        var names = sortByIdAndExtractNames(products);
        System.out.println(names);
    }

    static <T extends HasId & HasName> List<String> sortByIdAndExtractNames(List<T> list) {
        return list.stream().sorted(Comparator.comparing(HasId::id)).map(HasName::name).toList();
    } // When using a class along with multiple interfaces as bounds, specify the class first, then the interfaces
    // FYI: Java does not support union types!
}
