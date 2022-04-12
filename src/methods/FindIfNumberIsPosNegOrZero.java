package methods;
import utilities.MathHelper;

import java.util.Scanner;

public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {
        /*
        Ask user to enter an any number
        -Print "The number is positive" if the user enter a positive number
        -Print "The number is negative" if the user enter a negative number
        -Print "The number is zero" if the user enters zero
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n1 = input.nextInt();
        if(MathHelper.isPositive(n1)) System.out.println("The number is positive");
        else if(MathHelper.isNegative(n1)) System.out.println("The number is negative");
        else System.out.println("The number is zero");
    }
}
