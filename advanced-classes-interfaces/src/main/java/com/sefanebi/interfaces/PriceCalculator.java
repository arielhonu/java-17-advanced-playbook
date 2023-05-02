package com.sefanebi.interfaces;

import java.math.BigDecimal;

public interface PriceCalculator {
    BigDecimal calculatePrice(Order order);

    default BigDecimal calculateDiscount(Order order) {
        return BigDecimal.ZERO;
    }
}
