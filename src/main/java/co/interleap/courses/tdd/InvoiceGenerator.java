package co.interleap.courses.tdd;

import java.util.List;

public class InvoiceGenerator {

    private List<Ride> rides;

    InvoiceGenerator(List<Ride> rides) {
        this.rides = rides;
    }

    public double totalFare() {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += ride.fare();
        }

        return totalFare;
    }

    public int totalRides() {
        return this.rides.size();
    }

    public double averageFarePerRide() {
        return totalFare() / totalRides();
    }
}
