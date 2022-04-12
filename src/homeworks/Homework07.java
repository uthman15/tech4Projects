package homeworks;
import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {


        // Task-1
        int num1 = (int) (Math.random() * 11), num2 = (int) (Math.random() * 11), num3 = (int) (Math.random() * 11),
                num4 = (int) (Math.random() * 11);
        System.out.println("Number 1 = " + num1 + "\nNumber 2 = " + num2 + "\nNumber 3 = " + num3 + "\nNumber 4 = " +
                num4 + "\nAbsolute difference of " + num1 + " with 5 is = " + Math.abs(5 - num1) + "\nAbsolute difference of " +
                num2 + " with 5 is = " + Math.abs(5 - num2) + "\nAbsolute difference of " + num3 + " with 5 is = " + Math.abs(5 - num3) +
                "\nAbsolute difference of " + num4 + " with 5 is = " + Math.abs(5 - num4) + "\nGreatest number is = " + Math.max(Math.max(Math.max(num1, num2), num3), num4) +
                "\nSmallest number is = " + Math.min(Math.min(Math.min(num1, num2), num3), num4));

        // Task-2
        int numb1 = (int) (Math.random() * 101) - 50, numb2 = (int) (Math.random() * 101) - 50, numb3 = (int) (Math.random() * 101) - 50,
                numb4 = (int) (Math.random() * 101) - 50, numb5 = (int) (Math.random() * 101) - 50, numb6 = (int) (Math.random() * 101) - 50,
                numb7 = (int) (Math.random() * 101) - 50, numb8 = (int) (Math.random() * 101) - 50;
        int max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(numb1, numb2), numb3), numb4), numb5),
                numb6), numb7), numb8);
        int min = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(numb1, numb2), numb3), numb4), numb5),
                numb6), numb7), numb8);
        boolean positiveNumber = (numb3 > 0), negativeNumber = (numb5 < 0);

        System.out.print("Number 1 = " + numb1 + "\nNumber 2 = " + numb2 + "\nNumber 3 = " + numb3 + "\nNumber 4 = " + numb4 +
                "\nNumber 5 = " + numb5 + "\nNumber 6 = " + numb6 + "\nNumber 7 = " + numb7 + "\nNumber 8 = " + numb8 +
                "\nGreatest number is =  " + max + "\nSmallest Number is = " + min + "\nAverage of 8 numbers is = " +
                (numb1 + numb2 + numb3 + numb4 + numb5 + numb6 + numb7 + numb8) / 8 + "\nAbsolute difference between smallest and greatest is = " +
                Math.abs(max - min) / 2 + "\n3rd number is positive = " + positiveNumber + "\n5th number is negative = " + negativeNumber +
                "\nThere is at least one zero among those numbers is = ");
        if (numb1 == 0 || numb2 == 0 || numb3 == 0 || numb4 == 0 || numb5 == 0 || numb6 == 0 || numb7 == 0 || numb8 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        // TASK-3
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 7 numbers between 0 and 50 ");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(), n4 = input.nextInt(), n5 = input.nextInt(),
                n6 = input.nextInt(), n7 = input.nextInt();

        boolean greaterThanOrEqualTo10 = (n1 >= 10);
        boolean lessThanOrEqualTo40 = (n7 <= 40);

        System.out.print("Number 1 = " + n1 + "\nNumber 2 = " + n2 + "\nNumber 3 = " + n3 + "\nNumber 4 = " + n4 +
                "\nNumber 5 = " + n5 + "\nNumber 6 = " + n6 + "\nNumber 7 = " + n7 +
                "\nGreatest number is = " + (Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5), n6), n7)) +
                "\nSmallest number is = " + (Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5), n6), n7)) +
                "\nAverage of 7 number is = " + (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7 + "\nFirst number is greater than or equal to 10 = " + greaterThanOrEqualTo10 +
                "\nLast number is less than or equal to 40 = " + lessThanOrEqualTo40 + "\nFirst and last numbers are greater than 25 = " + (n1 > 25 && n7 > 25) +
                "\nAt least one of those numbers is 0 and 50 = ");
        if (n1 == 0 || n1 == 50 || n2 == 0 || n2 == 50 || n3 == 0 || n3 == 50 || n4 == 0 || n4 == 50 || n5 == 0 || n5 == 50
                || n6 == 0 || n6 == 50 || n7 == 0 || n7 == 50) System.out.println("true");
        else System.out.println("false");

        System.out.print("There is no number between 40 and 50 = ");
        if (n1 <= 50 || n1 >= 40 || n2 <= 50 || n2 >= 40 || n3 <= 50 || n3 >= 40 || n4 <= 50 || n4 >= 40 ||
        n5 <= 50 || n5 >= 40 || n6 <= 50 || n6 >= 40 || n7 <= 50 || n7 >= 40) System.out.println("true");
        else System.out.println("false");

        // Task-4
        int number1 = (int) (Math.random() * 101), number2 = (int)(Math.random() * 101), number3 = (int)(Math.random() * 101);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        if (number1 > 25 && number2 > 25 && number3 > 25) System.out.println("true");
        else System.out.println("false");

        // Task-5
        System.out.println("Please enter a number between 1 and 7");

        int day1 = input.nextInt();
        switch (day1){
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
                break;
            default:
                System.out.println("The number entered does not represent a day");
        }


        // Task-6
        System.out.println("Please enter a number between 10 and -10");
        int userNumber = input.nextInt();
        if (userNumber % 2 == 0) System.out.println("Number entered is EVEN");
        if (userNumber == 0) System.out.println("Number entered is ZERO");
        else if (userNumber % 2 != 0) System.out.println("Number entered is ODD");
        if (userNumber > 0) System.out.println("Number entered is POSITIVE");
        else if (userNumber < 0) System.out.println("Number entered is NEGATIVE");

        // Task-7

        System.out.println("Tell me your exam results?");
        int grade1 = input.nextInt(), grade2 = input.nextInt(), grade3 = input.nextInt();

        int average1 = (grade1 + grade2 + grade3) / 2;
        if (average1 > 70) System.out.println("YOU PASSED");
        else System.out.println("YOU FAILED");

        // Task-8

        System.out.println("Please enter 3 numbers");
        int nu1 = input.nextInt(), nu2 = input.nextInt(), nu3 = input.nextInt();

        if (nu1 == nu2 && nu2 == nu3) System.out.println("TRIPLE MATCH");
        else if (nu1 == nu2 || nu2 == nu3 || nu1 == nu3) System.out.println("DOUBLE MATCH");
        else if (nu1 != nu2 || nu2 != nu3 || nu1 != nu3) System.out.println("NO MATCH");







    }
}
