package org.length;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FeetTest {

    @Test
    public void one_feet_should_equal_to_one_feet() throws Exception {
        Feet feet = new Feet(1);
        Feet feet2 = new Feet(1);

        assertThat(feet, is(feet2));
    }

    @Test
    public void one_yard_should_not_equal_to_two_yards() throws Exception {
        Feet feet = new Feet(1);
        Feet feet2 = new Feet(2);

        assertThat(feet, not(equalTo(feet2)));
    }


    @Test
    public void one_feet_should_equal_to_12_inches() throws Exception {
        Feet feet = new Feet(1);
        Inch inch = new Inch(12);

        assertThat(feet, is(inch));
    }
}
