package scanner;

import java.util.Scanner;


public class ScannerExercises {
    public static void main(String[] args){

        /*
        Write a program that reads firstName and lastName from user and
        print those as full name in 1 statement
         */

        Scanner collectName = new Scanner(System.in);
        System.out.println("What is your first name?");
        String myFirstName = collectName.next();
        System.out.println("What is your last name?");
        String myLastName = collectName.next();
        System.out.println("The user's full name is = " + myFirstName + " " + myLastName);


        /*
        Write a Java program that reads the full address from user and print the address
         */

        /*
        Pseudo Code:

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the users full address?");
        String usersFullAddress = scanner.nextLine();
        System.out.println("The users address is = " + usersFullAddress);

        /*
        Write a java program that asks user to enter
        3 numbers and print the sum of those 3 numbers
        */

        /*
        1. create scanner object
        2. question
        3. print
         */

        Scanner userInput = new Scanner(System.in);

        System.out.println("First number:");
        int num1 = userInput.nextInt();
        System.out.println("Second number:");
        int num2 = userInput.nextInt();
        System.out.println("Third number:");
        int num3 = userInput.nextInt();

        System.out.println("Sum of the numbers is = " + (num1 + num2 + num3));




    }

}
