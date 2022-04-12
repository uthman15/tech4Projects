package ifElseStatements.ifStatements;
import java.util.Scanner;

public class EvenExample {
    public static void main(String[] args) {
        /*
Write a program that asks user to enter a number.
If the number entered is even, then print message "The number you entered is even!"

0, 2, 4, 6, 8, 10

EXAMPLE PROGRAM 1
Program: Please enter a number?
User: 6

Program: The number you entered is even!

EXAMPLE PROGRAM 2
Program: Please enter a number?
User: 13

Program:

 */
        Scanner scanner = new Scanner(System.in);
        int num = 8;

        boolean isEven = num % 2 == 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number?");
        if(in.nextInt() % 2 == 0){
            System.out.println("The number you entered is even!");
        };



    }
}
