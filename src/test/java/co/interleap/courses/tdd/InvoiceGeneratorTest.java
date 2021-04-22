package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldCalculateFareForZeroDistanceAndTime() {
        assertEquals(0, new InvoiceGenerator().fare(0, 0));
    }

    @Test
    public void shouldCalculateFareForFiveKmAndTwentyMin() {
        assertEquals(70, new InvoiceGenerator().fare(5, 20));
    }

}