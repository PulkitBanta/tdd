package co.interleap.courses.tdd;

public class Ride {

    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MIN = 1;

    private final int distanceInKm;
    private final int timeInMinutes;

    Ride(int distance, int time) {
        this.distanceInKm = distance;
        this.timeInMinutes = time;
    }

    public double fare() {
        return distanceInKm * FARE_PER_KM + timeInMinutes * FARE_PER_MIN;
    }
}
