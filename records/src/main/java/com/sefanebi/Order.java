package com.sefanebi;
import static com.sefanebi.Validation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public record Order (long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {
//    Normal construtor syntax
//    public Order(long id, Customer customer, LocalDateTime dateTime, List<OrderLine> lines) {
//        checkThat(customer != null, "customer must not be null");
//        checkThat(dateTime != null, "dateTime must not be null");
//        checkThat(lines != null && !lines.isEmpty(), "lines must not be null or empty");
//
//        this.id = id;
//        this.customer = customer;
//        this.dateTime = dateTime;
//        this.lines = List.copyOf(lines); // Defensive unmodifiable copy
//    }

//     Rules:
//     - The canonical constructor's access level cannot be more restrictive than that of the record itself
//     - the canonical constructor cannot have a 'throws' clause

    public Order {
        checkThat(customer != null, "customer must not be null");
        checkThat(dateTime != null, "dateTime must not be null");
        checkThat(lines != null && !lines.isEmpty(), "lines must not be null or empty");

        lines = List.copyOf(lines);
    }

//    public static Order createOrderAtCurrentDateTime(long id, Customer customer, List<OrderLine> lines) {
//        return new Order(id, customer, LocalDateTime.now(), lines);
//    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long id;
        private Customer customer;
        private LocalDateTime dateTime;
        private List<OrderLine> lines = new ArrayList<>();

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder forCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder atDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public Builder addLine(SaleOrderLine line) {
            this.lines.add(line);
            return this;
        }

        public Order build() {
            return new Order(id, customer, dateTime, lines);
        }
    }
}
