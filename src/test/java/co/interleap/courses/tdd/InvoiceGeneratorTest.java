package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void zeroDistanceAndTime() {
        assertEquals(0, new InvoiceGenerator().fare(0, 0));
    }

    @Test
    public void fiveKmAndTwentyMin() {
        assertEquals(70, new InvoiceGenerator().fare(5, 20));
    }

}