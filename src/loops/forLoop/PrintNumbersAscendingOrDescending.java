package loops.forLoop;

import java.util.Random;

public class PrintNumbersAscendingOrDescending {
    public static void main(String[] args) {
        /*
        Write a program that generates 2 random numbers between 0 and 25 (0 and
        25 are included), then orint all numbers between 2 random numbers that cannot be divided by 5 in ascending order.

        test data:
        int randomNUmber1 = 12;
        int randomNumber2 = 4;

        Expected Output:
        4 - 6 - 7 - 8 - 9 - 11 - 12
         */

        // How to generate random numbers

        Random random = new Random();
        int num1 = random.nextInt(26); // 0-25
        int num2 = random.nextInt(26); // 0-25

        System.out.println("Random number 1 = " + num1);
        System.out.println("Random number 2 = " + num2);

        String s = "";

        System.out.println("\nNumbers printed in ascending order\n");
        for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if(i % 5 !=0) s += i + " - ";
            System.out.println(s.substring(0, s.length()-3));
            }
    }
}
