package casting;
import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {

        /*
        Write a program ASKS user for 5 of their grades as string
        and print out their avg

        Input:
        45
        50
        55
        60
        65

        Output:
        55
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 of your grades:");
        String g1 = scan.next();
        String g2 = scan.next();
        String g3 = scan.next();
        String g4 = scan.next();
        String g5 = scan.next();
        double g1D = Double.parseDouble(g1);
        double g2D = Double.parseDouble(g2);
        double g3D = Double.parseDouble(g3);
        double g4D = Double.parseDouble(g4);
        double g5D = Double.parseDouble(g5);
        System.out.println((g1D + g2D +g3D + g4D + g5D) / 5);

        /*
        Write a program that asks users their balance as
        a string and asks for 3 transactions as string end
        print out the end result as double.

        Input:
        "What is your balance?"
        user:
        456.7

        "What is your next 3 transactions?
        user:
        34.1
        65.3
        28.4

        Output:
        "Your balance is now = x"

         */

        System.out.println("What is your balance? ");
        String b1 = scan.next();
        double b1D = Double.parseDouble(b1);

        System.out.println("What is your next 3 transactions? ");
        String t1 = scan.next();
        String t2 = scan.next();
        String t3 = scan.next();
        double t1D = Double.parseDouble(t1);
        double t2D = Double.parseDouble(t2);
        double t3D = Double.parseDouble(t3);

        System.out.println("Your balance is now = " + (b1D - (t1D + t2D + t3D)));

        /*
        Write a program ASK user for full name, age, phone number, and
        then enter their 3 kids age as string
        Print out the oldest kid, youngest and the age difference between oldest and youngest

        Program: "Please enter your name"
        User: John Doe
        Program: "Please enter your age:"
        User: 45
        Program: "Please enter your phone number:
        User: (123) 123 1234
        Program: "Enter the ages of your kids"
        User:
        12
        22
        17
        Program: Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between the oldest and youngest is 10 years.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String fullName = input.nextLine();

        System.out.println("Please enter your age: ");
        String age = input.next();
        input.nextInt(); //clearing the spaces!!!

        System.out.println("Please enter your phone number: ");
        String phoneNumber = input.nextLine();

        System.out.println("Enter the ages of your kids");
        String age1 = input.next(), age2 = input.next(), age3 = input.next();
        int age1Int = Integer.parseInt(age1), age2Int = Integer.parseInt(age2), age3Int = Integer.parseInt(age3);


        /*
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between the oldest and youngest is 10 years.
         */

        int oldestKid = Math.max(age3Int, Math.max(age1Int, age2Int));
        int youngestKid = Math.min(age3Int, Math.min(age1Int, age2Int));

        int ageDifference = Math.abs(oldestKid - youngestKid);

        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber +
                ", You are " + age + " years old, Your oldest kid is " + oldestKid + " years old, your" +
                "\nyoungest is " + youngestKid + ", difference between oldest and youngest is " + ageDifference +
                "\nyears.");




    }
}
