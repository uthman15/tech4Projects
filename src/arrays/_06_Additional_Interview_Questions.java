package arrays;

import java.util.Arrays;

public class _06_Additional_Interview_Questions {
    public static void main(String[] args) {

        /*
        int[] numbers = {5, 3, 0, -5};

        Find the greatest and print it

        RESULT:
        5
         */
        System.out.println("\n------Task-1-solution with sort");
        int [] numbers = {5, 3, 0, -5};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);

        System.out.println("\n------Task-1-solution without sort");

        //5, 3, 0, -5

        int max = numbers[0];

        for (int number : numbers){
            if (number > max) max = number;

        }
        System.out.println(max);

        /*
        TASK-2
        Create a double array and store below elements
        {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25}

        Find the minimum value

        RESULT:
        0.5
        */
        System.out.println("\n------Task-2------");


        double [] number = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double min = number[0];

        for (double deci : number) {
            if (deci < min) min = deci;
        }
        System.out.println(min);

        /*
        Use above double array and find second minimum value

        RESULT:
        1.5
         */
        System.out.println("\n------Task-3------");

        double min2 = Double.MAX_VALUE;

        for (double num2 : number){
            if (num2 != min && num2 < min2){
                min2 = num2;
            }
        }
        System.out.println(min2);


    }
}
