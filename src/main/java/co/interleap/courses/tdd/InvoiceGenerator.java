package co.interleap.courses.tdd;

public class InvoiceGenerator {
    public int fare(int distanceInKm, int timeInMin) {
        return distanceInKm * 10 + timeInMin;
    }
}
