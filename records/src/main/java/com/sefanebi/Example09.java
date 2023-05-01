package com.sefanebi;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Example09 {
    public static void main(String[] args) {
        var product1 = new Product(100123L, "Apples", "Tasty red apples");
        var product2 = new Product(100346L, "Bread", "Whole-wheat loaf");

        var customer = new Customer(500567L, "Joe Smith", "joe.smith@example.com");

        var order1 = new Order(200201L, customer, LocalDateTime.now(), List.of(
                new SaleOrderLine(product1, 6, new BigDecimal("5.94")),
                new SaleOrderLine(product2, 2, new BigDecimal("2.50"))
        ));

        var order2 = Order.builder()
                .withId(200201L)
                .forCustomer(customer)
                .atDateTime(LocalDateTime.now())
                .addLine(new SaleOrderLine(product1, 6, new BigDecimal("5.94")))
                .addLine(new SaleOrderLine(product2, 2, new BigDecimal("2.50")))
                .build();
    }
}
