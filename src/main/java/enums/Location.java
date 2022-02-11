package enums;

import products.Crisp;
import products.Product;

public enum Location {

    A1,
    A2,
    A3,
    A4,
    A5,
    B1,
    B2,
    B3,
    B4,
    B5,
    C1,
    C2,
    C3,
    C4,
    C5;

    private final int capacity;

    Location() {
        this.capacity = 5;
    }

    public int getCapacity() {
        return capacity;
    }
}
