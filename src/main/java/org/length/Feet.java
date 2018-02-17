package org.length;

    class Feet extends Length{

    Feet(int value) {
        super(value);
    }

    int value() {
        return 12 * value;
    }
}
