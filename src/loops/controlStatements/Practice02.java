package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 different integers
        between 0 to 10 (Both included)
        Print all the numbers between given 2 integers starting
        from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5

        6 8   -> 6 7 8

        9 7   -> 7 8 9

        1 3   -> 1 2 3
        3 7   -> 3 4 6 7
         */

        /*
                           -----------ANOTHER WAY TO DO THE PROBLEM----------
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = input.nextInt();

        System.out,println("Please enter number 2");
        int num2 = input.nextInt();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
                if(i != 5) System.out.println(i):
        }
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two different integers");
        int n1 = input.nextInt(); int n2 = input.nextInt();
        for (int i = Math.min(n1, n2); i <= Math.max(n1, n2); i++) {
            if (i == 5) continue;
            System.out.print(i + " ");
        }



    }
}
