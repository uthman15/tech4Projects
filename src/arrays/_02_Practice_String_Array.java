package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
        */

        System.out.println("\n--------Task-1------\n");
        String[] names = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted array = " + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("Sorted array = " + Arrays.toString(names));


        System.out.println("\n--------Task-2------\n");

        System.out.println("First name is = " + names[0]);
        System.out.println("Last name is = " + names[names.length-1]);

        /*
        TASK-3
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names starts with A

        EXPECTED:
        2
         */
        System.out.println("\n--------Task-3------\n");

        int count = 0;
        for (int i = 0; i <= names.length-1 ; i++) {
            if (names[i].startsWith("A")) count++;
        }
        System.out.println(count);

        System.out.println("\n--------Task-3 for each loop------\n");

        int count1 = 0;
        for (String name: names) {
            if (name.charAt(0) == 'A') count1++;
        }
        System.out.println(count1);

        System.out.println("\n--------Task-3 fori loop------\n");

        int countA2= 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].charAt(0) == 'A') countA2++;
        }

        System.out.println(countA2);


        System.out.println("\n--------Task-4------\n");
        /*
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names contains a-A or e-E

        Expected:
        5
         */
        System.out.println("\n--------Task-4 fori loop------\n");

        int count4= 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains("a") || names[i].toLowerCase().contains("e")) count4++;
        }

        System.out.println(count4);

        int count4_2= 0;

        System.out.println("\n--------Task-4 for each loop------\n");
        for (String students : names) {
            if (students.contains("A") || students.contains("E") || students.contains("a") || students.contains("e")) count4_2++;
        }

        System.out.println(count4_2);

        /*
        TASK-5
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names has at least 5 characters 5,6,7,8,9,.....

        EXPECTED:
        3
        */

        System.out.println("\n--------Task-5 for each loop------\n");

        int count5 = 0;
        for (String element: names) {
            if (element.length() >= 5) count5++;
        }

        System.out.println(count5);

        /*
        TASK-6
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Check if this array has an element that is equal to "Jennifer"
        if it has it, print true
        Otherwise, print false

        EXPECTED:
        false
        */
        System.out.println("\n--------Task-6------\n");

        boolean hasJennifer = false;
        for (String student : names) {
            if (student.equalsIgnoreCase("Jennifer")) {
                hasJennifer = true;
                break;
            }
        }

        System.out.println(hasJennifer);






    }
}
