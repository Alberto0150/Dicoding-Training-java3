package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class ListPlanet {
    public static void main(String[] args)
    {
        // declare array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";

        // using ArrayList
        List<String> planets = new ArrayList<>();
        //this method add() is use for adding object into List
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planet");
        // this method size() is use to get List size
        for( int i=0; i<planets.size();i++)
        {
            //this method get() is used for check List where the index is "i"
            System.out.println("\t index-"+i + "=" + planets.get(i));
        }

        // this method remove() is used to removing an object from List
        planets.remove("venus");

        System.out.println("Latest planet list:");
        for( int i=0; i<planets.size();i++)
        {
            //this method get() is used for check List where the index is "i"
            System.out.println("\t index-"+i + "=" + planets.get(i));
        }
    }
}
