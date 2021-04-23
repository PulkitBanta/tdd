package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InvoiceGeneratorGeneratorTest {

    @Test
    public void shouldGenerateStatementForZeroDistanceAndTime() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(0, 0));

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(rides);

        assertEquals(0, invoiceGenerator.getTotalFare(), 0.1);
        assertEquals(1, invoiceGenerator.getTotalRides());
        assertEquals(0, invoiceGenerator.getAverageFarePerRide(), 0.1);
    }

    @Test
    public void shouldGenerateStatementForFiveKmAndTwentyMin() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5, 20));

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(rides);

        assertEquals(70, invoiceGenerator.getTotalFare(), 0.1);
        assertEquals(1, invoiceGenerator.getTotalRides());
        assertEquals(70, invoiceGenerator.getAverageFarePerRide(), 0.1);
    }

    @Test
    public void shouldGenerateStatementForMultipleRides() {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new Ride(5, 20));
        rides.add(new Ride(4, 10));

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(rides);

        assertEquals(120, invoiceGenerator.getTotalFare(), 0.1);
        assertEquals(2, invoiceGenerator.getTotalRides());
        assertEquals(60, invoiceGenerator.getAverageFarePerRide(), 0.1);
    }

}