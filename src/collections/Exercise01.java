package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Create a list to store below data
        cities

        Berlin
        Chicago
        Dallas
        Miami
        Brugge
        Kiev

        Print the list
        Then, remove Miami and Dallas
        Print the list again

        RESULT:
        [Berlin, Chicago, Dallas, Miami, Brugge, Kiev]
        [Berlin, Chicago, Brugge, Kiev]
        */

        String [] cities1 = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};
        System.out.println(Arrays.toString(cities1));
        List<String> cities = new ArrayList<>(Arrays.asList(cities1));

        cities.remove("Chicago");
        cities.remove("Dallas");
        System.out.println(cities);





    }
}
