package co.interleap.courses.tdd;

import java.util.List;

public class InvoiceGenerator {

    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MIN = 1;

    public int create(List<Ride> rides) {
        return fare(rides.get(0));
    }

    public int fare(Ride ride) {
        return ride.getDistanceInKm() * FARE_PER_KM + ride.getTimeInMinutes() * FARE_PER_MIN;
    }
}
