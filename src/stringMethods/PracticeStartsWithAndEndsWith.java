package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {
        /*
        Ask user to enter a name
        If name starts with A or a, then print "You are in club A"
        If the name does not start with A or a, print "You are not in the club A"
         */

        String name = ScannerHelper.getANameFromUser();
        if(name.startsWith("A") || name.startsWith("a")) System.out.println("You are in club A");
        else System.out.println("You are not in the club A");


    }
}
