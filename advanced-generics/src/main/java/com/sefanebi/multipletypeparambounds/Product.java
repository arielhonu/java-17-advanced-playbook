package com.sefanebi.multipletypeparambounds;

public record Product(long id, String name, String description) implements HasId, HasName {
}
