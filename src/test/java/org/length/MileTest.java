package org.length;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MileTest {

    @Test
    public void one_mile_should_equal_to_one_mile() throws Exception {
        Mile mile = new Mile(1);
        Mile mile2 = new Mile(1);
        
        assertThat(mile, is(mile2));
    }
}
