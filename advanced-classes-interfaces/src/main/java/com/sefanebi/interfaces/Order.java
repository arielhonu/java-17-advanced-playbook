package com.sefanebi.interfaces;

import java.math.BigDecimal;

public record Order(long id, long quantity, BigDecimal price) {
}
