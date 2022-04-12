package homeworks;
import java.util.Scanner;

import utilities.RandomNumberGenerator;

public class Homework08 {
    public static void main(String[] args) {

        // Task-1
        int rant1 = RandomNumberGenerator.getRandomNumber(0, 50);
        if (rant1 >= 10 && rant1 <= 25) System.out.println("True");
        else System.out.println("False");


        // Task-2
        int rant2 = RandomNumberGenerator.getRandomNumber(1, 100);
        if (rant2 <= 50) {
            System.out.println(rant2 + " is in the 1st half");
            if (rant2 <= 25){
                System.out.println(rant2 + " is in the 1st quarter");
                }else {
                System.out.println(rant2 + " is in the 2nd quarter");
        }
            }else {
            System.out.println(rant2 + " is in the 2nd half");
            if (rant2 <= 75){
                System.out.println(rant2 + " is in the 3rd quarter");
            }else System.out.println(rant2 + " is in the 4th quarter");

        }

        // Task-3
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers between 1 to 10");
        int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(), n4 = input.nextInt(), n5 = input.nextInt();
        if (n1 >= 1 && n1 <= 10){
            n1 = n1 * 5;
        }else {
            n1 = 0;
        }
        if(n2 >= 1 && n2 <= 10){
            n2 = n2 * 4;
        }else {
            n2 = 0;
        }
        if(n3 >= 1 && n3 <= 10){
            n3 = n3 * 3;
        }else {
            n3 = 0;
        }
        if(n4 >= 1 && n4 <= 10){
            n4 = n4 * 2;
        }else {
            n4 = 0;
        }
        if(n5 >= 1 && n5 <= 10){
            n5 = n5 * 1;
        }else {
            n5 = 0;
        }
        System.out.println(n1 + n2 + n3 + n4 + n5);
    }

}
