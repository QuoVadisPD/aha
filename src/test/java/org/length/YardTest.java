package org.length;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class YardTest {

    @Test
    public void one_yard_should_equal_to_one_yard() throws Exception {
        Yard yard = new Yard(1);
        Yard yard2 = new Yard(1);

        assertThat(yard, is(yard2));
    }

    @Test
    public void one_yard_should_not_equal_to_two_yards() throws Exception {
        Yard yard = new Yard(1);
        Yard yard2 = new Yard(2);

        assertThat(yard, not(equalTo(yard2)));
    }
}
