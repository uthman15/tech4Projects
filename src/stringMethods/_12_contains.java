package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;

public class _12_contains {
    public static void main(String[] args) {
        /*
        Method Task: It is used to find out if a string contains another string or character
        -It is non-static, and we can call it with an object
        -It is a return type, and it returns a boolean
        -It takes a string argument
         */

        String s = "Good Morning!";

        System.out.println(s.contains("Good")); // true
        System.out.println(s.contains(""));// true
        System.out.println(s.contains("123")); // false
        System.out.println(s.contains(s)); // true

        /*
        Ask user to enter an address
        If address contains "chicago" in any way, then print "You are in the club"
        else, print "You are not in the club"

        Chicago, CHICAGO, cHIcaGO
         */

        String address = ScannerHelper.getAStringFromUser();

        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");


        if(address.toUpperCase().contains("CHICAGO")) System.out.println("You are in the club");
        else System.out.println("You are not in the club");

        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "You are not in the club");
        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");






         /*
        Ask user to enter their favorite color
        If their favorite color is green in ANY WAY, PRINT "YAY!"
        If it is not print "Oh no!"
        Green, GREEN, green, gREen
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fav color");
        String favColor = input.nextLine();

        if(favColor.toLowerCase().contains("green")){
            System.out.println("YAY!");
        }else System.out.println("Oh no");
















    }
}
