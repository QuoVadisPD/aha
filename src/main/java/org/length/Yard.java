package org.length;

class Yard {

    int value;

    Yard(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Mile) {
            return value == 1760 * ((Mile) o).value;
        }
        return value == ((Yard) o).value;
    }
}
