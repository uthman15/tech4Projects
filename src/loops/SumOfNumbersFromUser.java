package loops;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    /*
    Write a Java program that asks user to enter some numbers and
    find the sum of numbers given by user

    Example program
    Program: Please enter how many number you want to enter
    User: 3

    Program: Please enter number 1
    User: 10

    Program: Please enter number 2
    User: 7

    Program: Please enter number 3
    User: 8

    Expected output:
    25
    */
    public static void main(String[] args) {

        System.out.println("\n----Fori loop solution-----\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter");
        int totalNumbers = input.nextInt(); //10

        int sum = 0;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.println("Please enter number " + i);
            sum += input.nextInt();
        }

        System.out.println(sum);


        System.out.println("\n----while loop solution-----\n");
        System.out.println("Please enter how many number you want to enter?");
        int times = input.nextInt(); // 3

        int count = 1;
        int sum2 = 0;

        while(count <= times){
            System.out.println("Please enter number " + count);
            sum2 += input.nextInt();
            count++;
        }
        System.out.println(sum2);

    }
}
