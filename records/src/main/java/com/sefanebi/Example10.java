package com.sefanebi;

import java.math.BigDecimal;

public class Example10 {
    public static void main(String[] args) {
        var product = new Product(100123L, "Apples", "Tasty red apples");

        var line = new SaleOrderLine(product, 7, new BigDecimal("5.94"));

        var newLine1 = new SaleOrderLine(line.product(), line.quantity(), new BigDecimal("5.34"));

        var newLine2 = line.withQuantity(8).withPrice(new BigDecimal("7.92"));
    }
}
