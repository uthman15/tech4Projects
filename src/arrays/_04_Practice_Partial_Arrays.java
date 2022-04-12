package arrays;

import java.util.Arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */

        System.out.println("\n----Task-1----\n");
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        for (int number : numbers) {
            System.out.println(number);
        }


        System.out.println("\n----Task-2 for each loop----\n");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        System.out.println("\n----Task-2-for i loop----\n");
        int sum2 = 0;
        for (int i = 0; i < 7; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);

        /*
        TASK-3
        Find the sum of first 3 elements in the array

        RESULT:
        0
        */

        System.out.println("\n----Task-3----\n");

        int sumOfFirst3 = 0;
        for (int i = 0; i <= 2 ; i++) {
            sumOfFirst3 += numbers[i];
        }

        System.out.println(sumOfFirst3);

          /*
        TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
        */

        System.out.println("\n----Task-4----\n");

        int sumOfLast5 = 0;
        for (int i = numbers.length - 5; i < numbers.length; i++) {
            sumOfLast5 += numbers[i];
        }
        System.out.println(sumOfLast5);

        /*
        TASK-5
        Find the product of last 4 elements in the array but exclude zero if there are any
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        154
        */
        System.out.println("\n----Task-5----\n");

        int productOfLast4 = 1;
        for (int i = numbers.length - 4; i < numbers.length; i++) {
            if (numbers[i] != 0)
                productOfLast4 *= numbers[i];
        }
        System.out.println(productOfLast4);

        /*
        TASK-6
        Check your collection and print true if one of the element is 0
        Print false if none of the elements is zero

        RESULT:
        true
        */
        System.out.println("\n----Task-6-for i loop----\n");

        boolean isZero = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) isZero = true;
        }
        System.out.println(isZero);

        System.out.println("\n----Task-6-for each loop----\n");
         boolean hasZero = false;

         for (int number: numbers) {
             if (number == 0){
                 hasZero = true;
             }
         }




    }
}
