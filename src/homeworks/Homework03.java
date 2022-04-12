package homeworks;
import java.util.Scanner;


public class Homework03 {
    public static void main(String[] args) {

        //Task-1

        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter a number from 1-10.");
        int number1 = collect.nextInt();
        number1 = 5;
        System.out.println("Please enter a number from 1-10.");
        int number2 = collect.nextInt();
        number2 = 10;

        System.out.println("The number 1 entered by user is = " + number1 + "\n"
        + "The number 2 entered by user is = " + number2 + "\n"
        + "The sum of number 1 and 2 entered by user is = " + (number1 + number2));

        //Task-2

        System.out.println("Please enter a number from 1-50.");
        double firstNumber = collect.nextDouble();
        firstNumber = 45.45;
        System.out.println("Please enter a number from 1-50.");
        double secondNumber = collect.nextDouble();
        secondNumber = 5;

        System.out.println("The number 1 entered by user is = " + firstNumber + "\n"
        + "The number 2 entered by user is = " + secondNumber + "\n"
        + "The division of number 1 and 2 entered by user is = " + firstNumber / secondNumber);

        //Task-3
        int num1 = -10;
        int num2 = 7;
        int num3 = 5;
        System.out.println(num1 + (num2 * num3));

        int num4 = 72;
        int num5 = 24;
        System.out.println((num4 + num5) % num5);

        int num6 = 10;
        int num7 = -3;
        int num8 = 9;
        System.out.println((num6 + num7) * (num8 / num8));

        int sum9 = 5;
        int sum10 = 18;
        int sum11 = 3;
        int sum12 = 6;
        System.out.println(sum9 + sum10 / sum11 * sum11 - (sum12 % sum11));

        //Task-4

        System.out.println("Pick a number between 1-25 ");
        double numb1 = collect.nextDouble();
        numb1 = 24;
        System.out.println("Pick a number between 1-25 ");
        double numb2 = collect.nextDouble();
        numb2 = 10;
        System.out.println("The sum of the given numbers is = " + (numb1 + numb2) + "\n"
        + "The product of the given numbers is = " + (numb1 * numb2) + "\n"
        + "The subtraction of the given numbers is = " + (numb1 - numb2) + "\n"
        + "The division of the given numbers is = " + (numb1 / numb2) + "\n"
        + "The remainder of the given numbers is = " + (numb1 % numb2));

        //Task-5

        double width = 7.5;
        double height = 10.5;

        System.out.println("The area of the rectangle = " + (width * height) +
                "\nThe perimeter of the rectangle = " + (2 * (width + height)));

        //Task-6

        double salary = 90000.00;
        double years = 3;

        System.out.println("The Software Engineer in Test can earn " + (salary * years) + " in \n3 years.");










    }
}
