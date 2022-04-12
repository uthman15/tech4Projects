package homeworks;
import java.util.Scanner;


public class Homework05 {
    public static void main(String[] args) {

        // Task-1
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers ");

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        System.out.println("Max value = " + (Math.max(Math.max(x,y),z)));
        System.out.println("Min value = " + (Math.min(Math.min(x,y),z)));

        // Task-2
        System.out.println("Please enter 5 numbers");
        int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt(), num4 = scan.nextInt(), num5 = scan.nextInt();
        System.out.println("Max value = " + (Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5)));
        System.out.println("Min value = " + (Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5)));

        // Task-3
        System.out.println("Please enter 2 numbers");
        int num6 = scan.nextInt(), num7 = scan.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(num6 - num7));

        // Task-4
        System.out.println("Please generate 3 numbers");
        int ranNum1Between50And100 = (int) (Math.random() * 51) + 50;
        int ranNum2Between50And100 = (int) (Math.random() * 51) + 50;
        int ranNum3Between50And100 = (int) (Math.random() * 51) + 50;
        System.out.println("Number 1 = " + ranNum1Between50And100 + "\nNumber 2 = " + ranNum2Between50And100
        + "\nNumber 3 = " + ranNum3Between50And100 + "\nThe sum of numbers is = " +
                (ranNum1Between50And100 + ranNum2Between50And100 + ranNum3Between50And100));

        // Task-5
        double alexMoney = 125;
        double mikeMoney = 220;
        System.out.println("Alex's money: $" + (alexMoney - 25.5) + "\nMikes money: " + (mikeMoney + 25.5));

        // Task-6
        double amountForBike = 390, savePerDay = 15.60;
        System.out.println((int) (amountForBike / savePerDay));






    }
}
