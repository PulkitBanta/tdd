package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorTest {

    @Test
    public void shouldGenerateStatementForZeroDistanceAndTime() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(0, 0));

        InvoiceGenerator generator = new InvoiceGenerator(rides);

        assertEquals(0, generator.totalFare(), 0.1);
        assertEquals(1, generator.totalRides());
        assertEquals(0, generator.averageFarePerRide(), 0.1);
    }

    @Test
    public void shouldGenerateStatementForFiveKmAndTwentyMin() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5, 20));

        InvoiceGenerator generator = new InvoiceGenerator(rides);

        assertEquals(70, generator.totalFare(), 0.1);
        assertEquals(1, generator.totalRides());
        assertEquals(70, generator.averageFarePerRide(), 0.1);
    }

    @Test
    public void shouldGenerateStatementForMultipleRides() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5, 20));
        rides.add(new Ride(4, 10));

        InvoiceGenerator generator = new InvoiceGenerator(rides);

        assertEquals(120, generator.totalFare(), 0.1);
        assertEquals(2, generator.totalRides());
        assertEquals(60, generator.averageFarePerRide(), 0.1);
    }

}