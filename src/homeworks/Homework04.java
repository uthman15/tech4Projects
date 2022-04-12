package homeworks;
import java.util.Scanner;


public class Homework04 {
    public static void main(String[] args) {

        // Task-1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The average of the given 2 numbers is: " + (num1 + num2) / 2);

        // Task-2
        System.out.println("Please enter two numbers ");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        System.out.println("The product of the given 2 numbers is: " + (num3 * num4));

        // Task-3
        System.out.println("Please enter three numbers ");
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        System.out.println("The 5 multiplied with 5 is = " + (num5 * num5) + "\n"
        + "The 6 multiplied with 6 is = " + (num6 * num6) + "\n"
        + "The 10 multiplied with 10 is = " + (num7 * num7));

        // Task-4
        System.out.println("Please enter 2 numbers ");
        int num8 = scanner.nextInt();
        int num9 = scanner.nextInt();
        System.out.println("The remainder of 25 % 8 = " + (num8 % num9));

        // Task-5
        System.out.println("Please enter 5 numbers ");
        int num10 = scanner.nextInt();
        int num11 = scanner.nextInt();
        int num12 = scanner.nextInt();
        int num13 = scanner.nextInt();
        int num14 = scanner.nextInt();
        System.out.println("The average of the given 5 numbers is: " + (num10 + num11 + num12 + num13 + num14) / 5);

        // Task-6
        System.out.println("Please enter a number");
        int num15 = scanner.nextInt();
        System.out.println("7*1 = " + num15 + "\n"
        + "7*2 = " + (num15 * 2) + "\n"
        + "7*3 = " + (num15 * 3) + "\n"
        + "7*4 = " + (num15 * 4) + "\n"
        + "7*5 = " + (num15 * 5) + "\n"
        + "7*6 = " + (num15 * 6) + "\n"
        + "7*7 = " + (num15 * 7) + "\n"
        + "7*8 = " + (num15 * 8) + "\n"
        + "7*9 = " + (num15 * 9) + "\n"
        + "7*10 = " + (num15 * 10));

        // Task-7
        System.out.println("Please enter the side of the square");
        int num16 = scanner.nextInt();
        System.out.println("Perimeter of the square = " + (num16 * 4) + "\n"
        + "Area of the square = " + (num16 * num16));






    }
}
