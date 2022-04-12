package arrays;

import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {
        /*
        Task-1
        Create an array that will store 4 fruit names
        Then, print the empty array
         */

        String[] fruit = new String[4];
        System.out.println(Arrays.toString(fruit));

        /*
        task-2
        Store your fav fruit and store it in the index of 0
        Store the 4th fav fruit in the index of 3
        Print the array again
         */

        fruit[0] = "Watermelon";
        fruit[3] = "Pineapple";
        System.out.println(Arrays.toString(fruit));

        /*
        Task-3
        Find the size of your array and print it
        SIZE = How many elements you have in the array

        Expected OUTPUT:
        4
         */

        System.out.println(fruit.length); //4

        /*
        Task-4
        Print the elements at the index of 0 and 3
         */
        System.out.println(fruit[0]);
        System.out.println(fruit[3]);

        //What if we wanted to get a value that is null
        System.out.println(fruit[1]);

        System.out.println(fruit[0].toUpperCase()); // WATERMELON
        System.out.println(fruit[0].charAt(0)); // W
        System.out.println(fruit[3].length()); // 9
        System.out.println(fruit[3].startsWith("P")); //true

        System.out.println(fruit[1].length()); // NullPointerException
    }
}
