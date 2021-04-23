package co.interleap.courses.tdd;

public class Ride {
    private final int distanceInKm;
    private final int timeInMinutes;

    Ride(int distance, int time) {
        this.distanceInKm = distance;
        this.timeInMinutes = time;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

}
