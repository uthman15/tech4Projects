package ifElseStatements.ifElseStatements;
import java.util.Scanner;

public class MathGrade {
    public static void main(String[] args) {
        /*

Write a program that asks David what his balance is. If David's balance is greater
than or equal to $600.0, then print message "Awesome! You have enough money!".
If David's balance is less than $600.0, then print message "Sorry!  You are poor!".

EXAMPLE PROGRAM 1
Program: Hey David! Please enter your math grade?
User: 60

Program: Awesome! You have passed the math class!

EXAMPLE PROGRAM 2
Program: Hey David! Please enter your math grade?
User: 59

Program: Sorry! You failed!

 */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String fullName = scan.nextLine();

        System.out.println("Hey " + fullName + "! Please enter your balance?");
        double balance = scan.nextDouble(); //Double.parseDouble(scan.next());

    }
}
