package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldCalculateFareForZeroDistanceAndTime() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(0, 0));
        assertEquals(0, new InvoiceGenerator().create(rides));
    }

    @Test
    public void shouldCalculateFareForFiveKmAndTwentyMin() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5, 20));
        assertEquals(70, new InvoiceGenerator().create(rides));
    }

}