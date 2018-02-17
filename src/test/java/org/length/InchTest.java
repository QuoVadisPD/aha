package org.length;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InchTest {

    @Test
    public void one_inch_should_equal_to_one_inch() throws Exception {
        Inch inch = new Inch(1);
        Inch inch2 = new Inch(1);

        assertThat(inch, is(inch2));
    }

    @Test
    public void one_inch_should_not_equal_to_two_inches() throws Exception {
        Inch inch = new Inch(1);
        Inch inch2 = new Inch(2);

        assertThat(inch, not(equalTo(inch2)));
    }
}
