package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their date of year
        Then calculate their age and print with the message below

        Expected OUTPUT:
        You are {age} years old!
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year of birth");
        int YOB = input.nextInt();

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        dateFormat.format(date);

        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date))-YOB) + "years old!");

    }
}
