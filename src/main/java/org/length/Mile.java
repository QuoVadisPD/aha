package org.length;

class Mile extends Length {

    Mile(int value) {
        super(value);
    }

    int value() {
       return 1760 * 3 * 12 * value;
    }
}
