

Imagine there is a farmer growing a large land. I have a device to measure the amount of N (Nitrogen) in a location of this land. Using this device I have measured the N values of several locations and I have coordinates of each location.

The problem is I need an algorithm to

  -  approximate the coordinates of the location where the N value is minimum.
  -  approximate the N value of that location

Here is the class for keeping Measurement values. It includes coordinates and the corresponding N value of the location.

```java
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

    public double getN() {
        return N;
    }
}
```

Here is the Main.java class.

```java
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList<Measurement> measurements = new ArrayList<>();
//following data is not real.
measurements.add(new Measurement(4.1214,5.3445,4));
measurements.add(new Measurement(4.1224,5.3431,10));
measurements.add(new Measurement(4.1220,5.3450,15));
measurements.add(new Measurement(4.121,5.3440,1));
measurements.add(new Measurement(4.1211,5.3437,4));
measurements.add(new Measurement(4.1215,5.3475,24));

        Measurement approximated = findMinimumConcentrationLocation(measurements);
    }

    private static Measurement findMinimumConcentrationLocation(ArrayList<Measurement> measurements) {
        //TODO : implement this

        return null;
    }
}
```

This is a real practical problem I got when doing a project (mobile app), not homework or an assignment.

Edit: Assume the area that I need to find the minimum concentration of N is like the convex hull polygon. (https://www.geeksforgeeks.org/convex-hull-set-1-jarviss-algorithm-or-wrapping/).I am going to get measurements from around the border, and the middle of the area so we can assume that the convex hull gives the target area.

Also, assume that the land is fully horizontal.

I don't want the measurement with minimum values. It will be inaccurate in most cases.
