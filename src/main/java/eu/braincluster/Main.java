package eu.braincluster;

import java.util.HashMap;

public class Main
{
    public static void example1()
    {
        System.out.println("HashMap example 1");

        var map = new HashMap<String, Integer>();

        map.put("Pistaba", 1970);
        map.put("Feriba", 1975);

        for (var pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }

    public static void main(String[] args)
    {
        System.out.println("HashMap test program");
        System.out.println();

        example1();
        System.out.println();
    }
}