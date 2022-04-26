package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 10};
        System.out.println(Arrays.toString(arr));


        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));

        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, cities);
        cities2.add("Tokyo");

        System.out.println(cities2);
        System.out.println(cities2.get(3)); // Denver

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println("Name at index of 5 = " + names.get(5));



    }
}
