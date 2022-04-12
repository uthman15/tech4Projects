package homeworks;

    import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your first name?");
        String myFirstName = collect.next();

        System.out.println("What is your last name?");
        String myLastName = collect.next();

        System.out.println("What is your age?");
        int myAge = collect.nextInt();

        System.out.println("What is your email address?");
        String myEmailAddress = collect.next();

        System.out.println("What is your phone number?");
        collect.nextLine();
        String myPhoneNumber = collect.nextLine();

        System.out.println("What is your address?");
        String myAddress = collect.nextLine();

        System.out.println("User who joined this program is " + myFirstName + " " + myLastName + ". " + myFirstName + "'s age is \n"
                + myAge + ". " + myFirstName + "'s email address is " + myEmailAddress + "," + " phone number \n "
                + myPhoneNumber + "," + " and address is " + myAddress + ".");

        // Task 2

        System.out.println("What is your favorite book?");
        String myFavoriteBook = collect.nextLine();

        System.out.println("What is your favorite color?");
        String myFavoriteColor = collect.next();

        System.out.println("What is your favorite number?");
        int myFavoriteNumber = collect.nextInt();

        System.out.println("User's favorite book is: " + myFavoriteBook + "\n"
                + "User's favorite color is: " + myFavoriteColor + "\n"
                + "User's favorite number is: " + myFavoriteNumber);


        System.out.println("User who joined this program is " + myFirstName + " " + myLastName + "." + " " + myFirstName +"'s age is " + "\n"
                + myAge + "." + " " + myFirstName + "'s email address is" + " " + myEmailAddress + "," + " " + "phone number" + "\n"
                + myPhoneNumber + "," + " " + "and address is" + " " + myEmailAddress + ".");








    }


}
