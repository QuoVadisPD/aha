package org.length;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class MileTest {

    @Test
    public void one_mile_should_equals_to_5280_feet() throws Exception {
        Mile mile = new Mile(1);
        Feet feet = new Feet(5280);

        assertThat(mile, is(feet));
        assertThat(feet, is(mile));
    }

    @Test
    public void one_mile_should_equals_to_1760_yard() throws Exception {
        Mile mile = new Mile(1);
        Yard yard = new Yard(1760);

        assertThat(mile, is(yard));
        assertThat(yard, is(mile));
    }

    @Test
    public void one_mile_should_equal_to_one_mile() throws Exception {
        Mile mile = new Mile(1);
        Mile mile2 = new Mile(1);

        assertThat(mile, is(mile2));
    }

    @Test
    public void one_mile_should_not_equal_to_two_miles() throws Exception {
        Mile mile = new Mile(1);
        Mile mile2 = new Mile(2);

        assertThat(mile, not(equalTo(mile2)));
    }
}
