package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from user
        Reverse the name and print it back

        Test Data:
        Kaly

        Expected output:
        ylak

        Test data:
        Abraham

        Expected output:
        maharba
         */

        String name = ScannerHelper.getANameFromUser();
        String reversedName = "";
        for (int i = name.length()-1; i >= 0; i--){
            reversedName += name.charAt(i);
        }
        System.out.println("The reversed name = " + reversedName);
        System.out.println("The reversed name to uppercase = " + reversedName.toUpperCase());
    }
}
