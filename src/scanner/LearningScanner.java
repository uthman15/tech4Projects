package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I am going to use Scanner class for creating my object.
        2. I will use the object for reading the data.
         */

        Scanner scanner = new Scanner(System.in); // creating a scanner object for using the methods

        System.out.println("Please put your first name"); // this is what I want user to put
        String firstName = scanner.next(); // storing the first name from user

        System.out.println("the name user put = " + firstName); // printing my object/variable

    }
}
