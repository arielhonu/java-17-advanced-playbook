package com.sefanebi;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Example05 {
    public static void main(String[] args) {
        var product1 = new Product(100123L, "Apples", "Tasty red apples");
        var product2 = new Product(100346L, "Bread", "Whole-wheat loaf");

        var customer = new Customer(500567L, "Joe Smith", "joe.smith@example.com");

        var lines = new ArrayList<OrderLine>();
        lines.add(new SaleOrderLine(product1, 6, new BigDecimal("5.94")));
        lines.add(new SaleOrderLine(product2, 2, new BigDecimal("2.50")));

        var order = new Order(200201L, customer, LocalDateTime.now(), lines);

        var orderLine = new SaleOrderLine(new Product(100892L, "Bananas", "Yellow bananas"), 1, new BigDecimal("0.99"));
        order.lines().add(orderLine);
        System.out.println(order);
    }
}
