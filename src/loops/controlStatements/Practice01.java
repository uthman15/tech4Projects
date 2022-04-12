package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a Java program that ask user to enter 2 diff
        integers
        Print all the numbers between given 2 integers starting from
        biggest to smallest (given numbers are included)
        HOWEVER, do not print any number less than 10

        5 9 -> 9 8 7 6 5

        8 4 -> 8 7 6 5 4
        */

        /*
        Ask user to enter 2 numbers
        Store number in int variables
        Compare numbers and find biggest and smallest
        Start a loop with below info
            StartPoint : max number
            EndPoint : min number
            Update : decrement
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two different integers");
        int n1 = input.nextInt(); int n2 = input.nextInt();
        for (int i = Math.max(n1, n2); i >= Math.min(n1, n2); i--){
            System.out.print(i + " ");
            if(i == 10) break; // it will be on the page when you have 10 in the margin 3-17
        }


    }
}
