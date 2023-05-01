package com.sefanebi;

public sealed interface OrderLine permits SaleOrderLine, DiscountOrderLine {
}
