package co.interleap.courses.tdd;

import java.util.List;

public class InvoiceGenerator {

    public double create(List<Ride> rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += ride.fare();
        }

        return totalFare;
    }

}
