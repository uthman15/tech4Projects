package projects;
import java.util.Scanner;


public class Project02 {
    public static void main(String[] args) {

        // Task-1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter a number.");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter a number.");
        int thirdNumber = scanner.nextInt();

        System.out.println("The product of the numbers entered is = " + (firstNumber * secondNumber * thirdNumber));


        // Task-2
        System.out.println("What is your first name? ");
        String firstName = scanner.next();

        System.out.println("What is your last name? ");
        String lastName = scanner.next();

        System.out.println("What is your year of birth? ");
        int birthYear = scanner.nextInt();

        System.out.println(firstName + " " + lastName + "'s age is = " + (2022 - birthYear) + ".");


        // Task-3
        System.out.println("What is your full name? ");
        scanner.nextLine();
        String fullName = scanner.nextLine();

        System.out.println("What is your weight? ");
        int myWeight = scanner.nextInt();

        System.out.println(fullName + "'s weight is = " + (myWeight * 2.205) + " lbs.");

        // Task-4
        System.out.println("What is your full name? ");
        scanner.nextLine();
        String student1Name = scanner.nextLine();

        System.out.println("What is your age? ");
        int student1Age = scanner.nextInt();

        System.out.println("What is your full name? ");
        scanner.nextLine();
        String student2Name = scanner.nextLine();

        System.out.println("What is your age? ");
        int student2Age = scanner.nextInt();

        System.out.println("What is your full name? ");
        scanner.nextLine();
        String student3Name = scanner.nextLine();

        System.out.println("What is your age? ");
        int student3Age = scanner.nextInt();

        int student1And2 = Math.max(student1Age, student2Age);

        int student1And3 = Math.min(student1Age, student3Age);

        System.out.println(student1Name + "'s age is " + student1Age + ".\n"
        + student2Name + "'s age is " + student2Age + ".\n"
        + student3Name + "'s age is " + student3Age + ".\n" +
        "The average age is " + ((student1Age + student2Age + student3Age) / 3) + ".\n" +
        "The eldest age is " + (Math.max(student3Age, student1And2)) + ".\n" +
        "The youngest age is " + (Math.min(student2Age, student1And3)) + ".");




    }
}
