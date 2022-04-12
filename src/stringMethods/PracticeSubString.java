package stringMethods;
import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeSubString {
    public static void main(String[] args) {
        /*
Write a program that asks user to enter a sentence (multiple words)
Find and print the first and the last words from the given sentence with below messages

Test data1:
I like Java

Expected output:
The first word is = I
The last word is = Java

Test data2:
Today is Sunday

Expected output:
The first word is = Today
The last word is = Sunday

First word -> 0 - indexOf(' ')
Last word -> lastIndexOf(' ') + 1
 */

        String sentence = ScannerHelper.getAStringFromUser(); //Enter a sentence

        String first = sentence.substring(0, sentence.indexOf(' '));
        String last = sentence.substring(sentence.lastIndexOf(' ')+1);

        System.out.println("The first word is = " + first);
        System.out.println("The last word is = " + last);


    }
}
