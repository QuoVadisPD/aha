package org.length;

class Mile {
    int value;

    Mile(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Yard) {
            return value * 1760 == ((Yard) o).value;
        }
        return value == ((Mile) o).value;
    }
}
