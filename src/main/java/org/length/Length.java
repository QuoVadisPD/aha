package org.length;

public abstract class Length {

    protected int value;

    Length(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return value() == ((Length) o).value();
    }

    abstract int value();
}
