package org.example;

public class Measurement {
    private double latitude;
    private double longitude;
    private double N;

    public Measurement(double latitude, double longitude, double n) {
        this.latitude = latitude;
        this.longitude = longitude;
        N = n;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", N=" + N +
                '}';
    }

    public double getN() {
        return N;
    }
}
