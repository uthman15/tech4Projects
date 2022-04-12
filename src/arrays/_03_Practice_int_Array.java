package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {
        /*
        Create an int array and store below data

        -3
        -7
        0
        2
        0
        7
        7
        10
        2
        15

        Print the array with message "Array not sorted = "
        Print the sorted array with message "Array sorted = "
         */

        System.out.println("\n--------Task-1------\n");

        int[] num = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array not sorted = " + Arrays.toString(num));

        Arrays.sort(num);
        System.out.println("Array sorted = " + Arrays.toString(num));

        /*
        TASK-2
        Count how many positive-negative and zero numbers you have

        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
         */
        System.out.println("\n--------Task-2------\n");

        int countP = 0;
        int countN = 0;
        int countZ = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) countP++;
            else if (num[i] < 0) countN++;
            else countZ++;
        }

        System.out.println("Positives = " + countP + "\nNegatives = " + countN + "\nZeros = " + countZ);

        /*
        TASK-3
        Count how many even and odds

        EXPECTED:
        Evens = 5
        Odds = 5
        */

        System.out.println("\n--------Task-3------\n");

        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length ; i++) {
            if (num[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Evens = " + even);
        System.out.println("Odds = " + odd);




    }
}
