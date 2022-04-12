package stringMethods;
import java.util.Scanner;

public class PracticeComparison {
    /*
    Write a Java program that asks user to enter 2 strings
    And store answers of user in different string variables
    Finally, check if given 2 strings are equal or not and print messages given below


   Test data 1:
   Java
   java

   Expected output 1:
   These strings are not equal

   Test daya 2:
   Hello
   Hello

   Expected output 2:
   These strings are equal
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 strings");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if(s1.equals(s2)) {
            System.out.println("These strings are equal");
        }else{
            System.out.println("These strings are not equal");
        }

    }
    /*
    2nd Way
    public static String getAStringFromUser(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a string: ");
    String string = scanner.nextLine();
    return string;

    //1st way
        System.out.println("\n---------1st-way---------\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string");
        String s1 = input.nextLine();

        System.out.println("Please enter another string");
        String s2 = input.nextLine();

        if(s1.equals(s2)) System.out.println("These string are equal");
        else System.out.println("These strings are not equal");


        //2nd way
        System.out.println("\n---------2nd-way---------\n");
        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "These string are equal" : "These string are not equal");
}
     */
}
