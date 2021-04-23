package co.interleap.courses.tdd;

import java.util.List;

public class InvoiceGenerator {
    private final int totalRides;
    private final double totalFare;
    private final double averageFarePerRide;

    public InvoiceGenerator(List<Ride> rides) {
        this.totalRides = rides.size();
        this.totalFare = totalFare(rides);
        this.averageFarePerRide = this.totalFare / rides.size();
    }

    public double totalFare(List<Ride> rides) {
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += ride.fare();
        }

        return totalFare;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public int getTotalRides() {
        return totalRides;
    }

    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }

}
