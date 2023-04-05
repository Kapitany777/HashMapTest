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

    public static void example2()
    {
        System.out.println("HashMap example 2");

        var map = new HashMap<String, Integer>();

        map.put("Pistaba", 1970);
        map.put("Feriba", 1975);

        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }

    public static void example3()
    {
        System.out.println("HashMap example 3");

        var squares = new HashMap<Integer, Integer>();

        for (int i = 1; i <= 5; i++)
        {
            squares.put(i, i * i);
        }

        squares
                .entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + "^2 = " + e.getValue()));
    }

    public static void main(String[] args)
    {
        System.out.println("HashMap test program");
        System.out.println();

        example1();
        System.out.println();

        example2();
        System.out.println();

        example3();
        System.out.println();
    }
}