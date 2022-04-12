package ifElseStatements;
import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter 2 numbers
        Find the smallest and print it

        EXAMPLE PROGRAM
        program: Please enter 2 numbers
        User: 5 7

        program: 5
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");
        int num1 = input.nextInt(), num2 = input.nextInt();

        if(num1 > num2)System.out.println(num2);
        else System.out.println(num1);

        /*
        Ternary Operator
        -Java ternary operator can be used instead of if-else statement
        _it is used a lot in java programming
        NOTE: It can be used only for simple if- else statement
        You cannot used for if - else if - else and nested if else statements
        variable variableName = condition ? option1 : option2;
         */

        int smallestNumber = num1 < num2 ? num1 : num2;

        System.out.println(smallestNumber);

        System.out.println("End of the program!");
        }

}
