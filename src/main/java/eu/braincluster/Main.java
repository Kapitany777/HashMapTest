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

    public static void example4()
    {
        System.out.println("HashMap example 4");

        var map = new HashMap<Integer, Integer>();

        System.out.println("A new map is created...");
        System.out.println("The map's size is: " + map.size());
        System.out.println("The map is empty: " + map.isEmpty());

        System.out.println("Adding something to the map...");
        map.put(1, 5);
        System.out.println("The map's size is: " + map.size());
        System.out.println("The map is empty: " + map.isEmpty());

        System.out.println("Clearing the map...");
        map.clear();
        System.out.println("The map's size is: " + map.size());
        System.out.println("The map is empty: " + map.isEmpty());
    }

    public static void example5()
    {
        System.out.println("HashMap example 5");

        var map = new HashMap<String, Integer>();

        map.put("Pistaba", 1970);

        if (map.containsKey("Pistaba"))
        {
            System.out.println(map.get("Pistaba"));
        }

        if (!map.containsKey("Feriba"))
        {
            System.out.println("Feriba not found...");
        }
    }

    public static void example6()
    {
        System.out.println("HashMap example 6");

        var people = new HashMap<String, Person>();

        people.put("JJ", new Person("James", "Japp"));
        people.put("AH", new Person("Arthur", "Hastings"));
        people.put("HP", new Person("Hercule", "Poirot"));

        people.forEach((m, p) -> System.out.println(p));

        var japp = people.get("JJ");

        if (japp != null)
        {
            System.out.println(japp);
        }
    }

    public static void example7()
    {
        System.out.println("HashMap example 7");

        var people = new HashMap<String, Person>();

        people.put("JJ", new Person("James", "Japp"));
        people.put("AH", new Person("Arthur", "Hastings"));
        people.put("HP", new Person("Hercule", "Poirot"));

        System.out.println("Keys:");
        people.keySet().forEach(k -> System.out.println(k));

        System.out.println("Values:");
        people.values().forEach(v -> System.out.println(v));
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

        example4();
        System.out.println();

        example5();
        System.out.println();

        example6();
        System.out.println();

        example7();
        System.out.println();
    }
}