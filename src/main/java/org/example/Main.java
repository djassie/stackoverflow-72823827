package org.example;

import java.util.ArrayList;
import java.util.Comparator;

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
//        measurements.forEach(System.out::println);
        System.out.println(approximated);
    }


    private static Measurement findMinimumConcentrationLocation(ArrayList<Measurement> measurements) {
        //TODO : implement this

        measurements.sort(Comparator.comparing(Measurement::getN));

//        measurements.forEach(System.out::println);
//        return measurements.get(measurements.size() -1);
        return measurements.get(0);
    }

}