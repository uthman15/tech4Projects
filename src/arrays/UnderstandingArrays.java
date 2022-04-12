package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        //One student's information
        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

        /*
        The new trend is to have multiple students information
         */

        String studentName = "Alex, Abe, Yakeen";
        // String ages = "20, 21, 22";

        //Can you print Abe's age only -> 21

        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21, 22};
        char[] favCharacters = { 'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        // HOW TO PRINT ARRAY
        System.out.println(names);

        String namesToString = Arrays.toString(names);
        System.out.println(namesToString);
        System.out.println(Arrays.toString(names));


        // HOW RO GET A SINGLE ELEMENT FROM ARRAY
        System.out.println(names[1]); // Abe
        System.out.println(names[0]); // Alex
        //System.out.println(names[5]); // ArrayIndexOutOfBounds


        // HOW TO UPDATE AN ELEMENT -> Abe-> Abraham
        names[1] = "Abraham";
        System.out.println(Arrays.toString(names)); //[Alex, Abaraham, Yakeen]

        //Alex's age is 20 and his fav char is A.
        //HOW TO LOOP ARRAY USING FORI LOOP
        for (int i = 0; i <= 2 ; i++) {
            System.out.println(names [i] + "'s age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");
        }

    }
}
