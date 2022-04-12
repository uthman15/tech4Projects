package arrays;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args) {
/*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H
        Print the array
 */
        System.out.println("\n-------Task-1---------\n");

        char[] num = {'#', '$', '5', 'A', 'b', 'H'};

        System.out.println(Arrays.toString(num));

        /*
        Task-2
        Print the size of the array with a message

        EXPECTED:
        The size of the array is = 6
         */
        System.out.println("\n-------Task-2---------\n");

        System.out.println("The size of the array is = " + num.length);

        /*
        Task-3
        Print each element using fori loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
         */
        System.out.println("\n-------Task-3---------\n");

        for (int i = 0; i <= num.length - 1 ; i++) {
            System.out.println(num[i]);
        }

        /*
        Task-4
        Print each element using for each loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
         */

        System.out.println("\n-------Task-4---------\n");

        for (char element: num){
            System.out.println(element);
        }

         /*
        Task-5
        Print each element that are letters

        EXPECTED:
        A
        b
        H
         */
        System.out.println("\n-------Task-5---------\n");

        for (int i = 0; i <= num.length-1 ; i++) {
            if (Character.isLetter(num[i])) System.out.println(num[i]);

        }

          /*
        Task-6
        Count how many uppercase characters you have in the array

        EXPECTED:
        2
         */

        System.out.println("\n-------Task-6---------\n");

        int countUpper = 0;
        for (int i = 0; i < num.length; i++) {
            if (Character.isUpperCase(num[i])) countUpper++;
        }
        System.out.println(countUpper);

    }
}
