package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet{
    public static void main(String[] args)
    {
        Map<String, Planet> planets = new HashMap();
        // method put() is use to add object to Map
        planets.put("key-1", new Planet("Mercury", 0.06));
        planets.put("key-2", new Planet("Venus", 0.82));
        planets.put("key-3", new Planet("Earth", 1.00));
        planets.put("key-4", new Planet("Mars", 0.11));
        //trying to add same key
        planets.put("key-4", new Planet("Mars-X", 0.11));

        System.out.println("Map awal : (size = " + planets.size() + ")");
        //loop using key from  Map itself
        for(String key : planets.keySet())
        {
            //use method get() to see inside Map in order of key
            System.out.println("\t " + key + " : " + planets.get(key));
        }

        planets.remove("key-2");

        System.out.println("Map planets akhir: (size = "+ planets.size() +")");
        for (Planet planet : planets.values()) { // looping value from Map
            System.out.println("\t " + planet);
        }


    }
}