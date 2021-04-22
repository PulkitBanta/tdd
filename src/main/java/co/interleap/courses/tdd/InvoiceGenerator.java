package co.interleap.courses.tdd;

public class InvoiceGenerator {

    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MIN = 1;

    public int fare(int distanceInKm, int timeInMin) {
        return distanceInKm * FARE_PER_KM + FARE_PER_MIN * timeInMin;
    }
}
