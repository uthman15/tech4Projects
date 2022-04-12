package stringMethods;
import java.util.Scanner;

public class PracticeLength {
    /*
    Write a program that asks user to enter their favorite book name and quote
    And store answers of user in different Strings
    Finally, print the length of those Strings with proper messages
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favorite book name");
        String book = input.nextLine();
        System.out.println("What is your favorite quote");
        String quote = input.nextLine();
        System.out.println("The length of my favorite book is " + book.length());
        System.out.println("The length of my favorite quote is " + quote.length());

    }
}
