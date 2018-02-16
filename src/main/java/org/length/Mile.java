package org.length;

class Mile {
    private int value;

    Mile(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        return value == ((Mile) o).value;
    }
}
