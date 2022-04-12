package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {
        /*
        Create an ArrayList called numbers that stores below numbers

        10
        12
        13
        8
        9
        15


         */

        System.out.println("\n-------Task-1-------\n");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);

        System.out.println("\n-------Task-2-for each loop-------\n");

        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 != 0) count++;
        }
        System.out.println("Odds = " + count);

        System.out.println("\n-------Task-2fori loop-------\n");
        count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) count++;
        }
        System.out.println("Odds = " + count);


        /*
        Practice:
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        /*
        Create a List called colors that stores below elements

        Purple
        Yellow
        blue
        red
        Brown
        Black
        White

        And then print the list

        RESULT:

         */

        List<String> colors = new ArrayList<>();

        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add("");
        colors.add(null);

        System.out.println(colors);

        /*
        Task-4
        Count how many colors in the colors list are staring with uppercase

        Result:
        5
         */

        System.out.println("\n-------Task-2-for each loop-------\n");
        int countU = 0;
        for (String color : colors) {
        //    if (color.charAt(0) >= 65 && color.charAt(0) <= 90) countU++;
            if (Character.isUpperCase(color.charAt(0))) countU++;
        }
        System.out.println(countU);


        System.out.println("\n-------TASK-4-fori loop ---------\n");
        countU = 0;

        for (int i = 0; i < colors.size(); i++) {
            if(Character.isUpperCase(colors.get(i).charAt(0))) countU++;
        }

        System.out.println(countU);

        /*
        Practice:
        Lowercase
        nulls
        empties
        That has the length of 4 at least
        That has the length of even or odd
        That has a or A
         */






    }
}
