package com.dicoding.javafundamental.collection;

import java.util.*;
public class Setplanet {
    public static void main(String[] args)
    {
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // adding more "earth" some more for testing
        planets.add("earth");
        planets.add("mars");

        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) {
            System.out.println("\t " + planet);
        }

        planets.remove("venus");

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping using Iterator
            System.out.println("\t " + iterator.next());
        }
    }
}
