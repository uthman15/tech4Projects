package mathClass;
import java.util.Scanner;


public class ExerciseMaxAndMin {
    public static void main(String[] args) {
        /*
        find the min and max of given 3 numbers, write down the Pseudo Code and print min and max with proper messages

        Note: Declare and Assign all of them in one single line
        x = 4, y = 67, z = -54
         */

        int x = 4;
        int y = 67;
        int z = -54;

        int minOfXY = Math.min(x, y);
        int minOfXYZ = Math.min(minOfXY, z);

        int maxOfXY = Math.max(x,y);
        int maxOfXYZ = Math.max(maxOfXY, z);

        System.out.println("The min of xyz = " + minOfXYZ);
        System.out.println("The max of xyz = " + maxOfXYZ);

        /*
        Write a program which is going to print the max of given 3 numbers
        4, 56, 23
         */
        Math.max(4, 56);
        Math.max(23, Math.max(4, 56));


        System.out.println("Max of given 3 numbers are = " + Math.max(23, Math.max(4, 56)));

        /*
        Write a program which is going to ask 4 NUMBERS print the max of retrieved 4 numbers.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 4 numbers: ");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt();

        Math.max(num1, num2); // One single number combined
        Math.max(num3, num4); // One single number combined
        Math.max(Math.max(num1, num2), Math.max(num3, num4));

        System.out.println("The biggest number you entered is = " +
                Math.max(Math.max(num1, num2), Math.max(num3, num4))); // getting the max of 4 numbers


        System.out.println("The smallest number you entered is = " +
                Math.min(Math.min(num1, num2), Math.min(num3, num4))); // getting the min of 4 numbers

        // random ()
        // - returns a double number between 0.0(inclusive) - 1.0 (exclusive).
        // - doesn't take any parameters.

        /*
         ex:
         - get a random number between 15 - 30 (Both included)
         (int) (Math.random() * (endPoint - startPoint + 1) + startPoint)
         */





































    }
}
