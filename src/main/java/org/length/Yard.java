package org.length;

class Yard extends Length {

    Yard(int value) {
        super(value);
    }

    int value() {
        return 3 * 12 * value;
    }
}
