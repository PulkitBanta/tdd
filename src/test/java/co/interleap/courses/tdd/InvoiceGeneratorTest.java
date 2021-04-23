package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void shouldCalculateFareForMultipleRides() {
        ArrayList<Ride> rides = new ArrayList<Ride>();
        rides.add(new Ride(4, 10));
        rides.add(new Ride(5, 20));

        assertEquals(120, new InvoiceGenerator().fare(rides));
    }

}