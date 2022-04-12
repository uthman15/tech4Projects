package homeworks;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("\n-------Task-1-------\n");

        String n1 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) n1 += i + " - ";
        }
        System.out.println(n1.substring(0,n1.length()-3));


        System.out.println("\n-------Task-2-------\n");

        String n2 = "";
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0 && i % 3 == 0) n2 += i + " - ";
        }
        System.out.println(n2.substring(0,n2.length()-3));


        System.out.println("\n-------Task-3-------\n");

        String n3 = "";
        for (int i = 100; i > 50; i--) {
            if (i % 5 == 0) n3 += i + " - ";
        }
        System.out.println(n3.substring(0,n3.length()-3));


        System.out.println("\n-------Task-4-------\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i +" is = " + i);
        }

        System.out.println("\n-------Task-5-------\n");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
                sum += i;
        }
        System.out.println(sum);


        System.out.println("\n-------Task-6-------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int num6 = input.nextInt();
        input.nextLine();
        int factorial = 1;
        for (int i = 1; i <= num6; i++) {
            if (num6 > 0) factorial *= i;
        }
        System.out.println(factorial);


        System.out.println("\n-------Task-7-------\n");

        System.out.println("Please enter your first and last name");
        String fullname = input.nextLine();
        int vowel = 0;

        for (int i = 0; i < fullname.length(); i++) {
            if ((fullname.toLowerCase().charAt(i) == 'a') || (fullname.toLowerCase().charAt(i) == 'e') ||
                    (fullname.toLowerCase().charAt(i) == 'i') || (fullname.toLowerCase().charAt(i) == 'o') ||
                    (fullname.toLowerCase().charAt(i) == 'u')){
                vowel++;
            }
        }
        System.out.println("There are " + vowel + " vowel letters in this full name");


        System.out.println("\n-------Task-8-------\n");

        int sum8 = 0;
        do {
            System.out.println("Please enter a number");
            int n = input.nextInt();
            sum8 += n;
            if (n < 100 && sum8 < 100) {
                System.out.println("Please enter a number");
                n = input.nextInt();
                sum8 += n;
            }
            else if (n > 100) System.out.println("This number is already more than 100");

        } while (sum8 < 100);
        System.out.println("Sum of entered numbers is at least 100");
        input.nextLine();


        System.out.println("\n-------Task-9-------\n");

        System.out.println("Given number: ");
        int n9 = input.nextInt();
        input.nextLine();
        int start0 = 0;
        int start1 = 1;
        for (int i = 1; i <= n9; ++i){
            System.out.print(start0 + " ");
            int sumOfPrevTwo = start0 + start1;
            start0 = start1;
            start1 = sumOfPrevTwo;
            System.out.println("\n");
        }

        System.out.println("\n-------Task-10-------\n");

        System.out.println("Please enter a name");
        String name10 = input.nextLine();

        do {
            if (!(name10.toLowerCase().startsWith("j")));{
                System.out.println("Please enter a name");
                name10 = input.nextLine();
            }
        }while (!(name10.toLowerCase().startsWith("j")));
        System.out.println("End of the program");

    }
}
