package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldCalculateFareForZeroDistanceAndTime() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(0, 0));
        assertEquals(0, new InvoiceGenerator().create(rides), 0.1);
    }

    @Test
    public void shouldCalculateFareForFiveKmAndTwentyMin() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5, 20));
        assertEquals(70, new InvoiceGenerator().create(rides), 0.1);
    }

    @Test
    public void shouldCalculateFareForMultipleRides() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5, 20));
        rides.add(new Ride(4, 10));
        assertEquals(120, new InvoiceGenerator().create(rides), 0.1);
    }

}