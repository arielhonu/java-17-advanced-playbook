package com.sefanebi;

import java.math.BigDecimal;

import static com.sefanebi.Validation.checkThat;

public record DiscountOrderLine(String discountCode, BigDecimal amount) implements OrderLine {

}
