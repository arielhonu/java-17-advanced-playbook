package com.sefanebi;

import java.math.BigDecimal;

import static com.sefanebi.Validation.checkThat;

public record SaleOrderLine(Product product, int quantity, BigDecimal amount) implements OrderLine {

    public SaleOrderLine {
        checkThat(product != null, "product must not be null");
        checkThat(amount != null, "amount must not be null");
    }

    public SaleOrderLine withQuantity(int newQuantity) {
        return new SaleOrderLine(this.product, newQuantity, this.amount);
    }

    public SaleOrderLine withPrice(BigDecimal newPrice) {
        return new SaleOrderLine(this.product, this.quantity, newPrice);
    }
}
