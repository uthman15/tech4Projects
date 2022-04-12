package homeworks;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("\n-------Task-1-------");
        Scanner input = new Scanner(System.in);

        System.out.println("Given String");
        String l1 = input.nextLine();

        if (l1.length() == 0) {
            System.out.println("Length is zero");
        } else {
            System.out.println("Length is = " + l1.length());
            System.out.println("First char is = " + l1.charAt(0));
            System.out.println("Last char is = " + l1.charAt(l1.length() - 1));
            if (l1.toLowerCase().contains("a") || l1.toLowerCase().contains("e") || l1.toLowerCase().contains("i") ||
                    l1.toLowerCase().contains("o") || l1.toLowerCase().contains("u"))
                System.out.println("This string has vowel");
            else System.out.println("This string does not have a vowel");
        }


        System.out.println("\n-------Task-2-------");

        System.out.println("Given String");
        String n1 = input.nextLine();

        if (n1.length() < 3) {
            System.out.println("Length is less than 3");
        } else if (n1.length() % 2 == 0) {
            System.out.println("" + n1.charAt(n1.length() / 2 - 1) + n1.charAt(n1.length() / 2));
        } else System.out.println(n1.charAt(n1.length()/2));

        System.out.println("\n-------Task-3-------");

        System.out.println("Given String");
        String str = input.nextLine();

        if (str.length() < 4){
            System.out.println("INVALID INPUT");
        }else{
            System.out.println("First 2 characters are = " + str.substring(0,2));
            System.out.println("Last 2 characters are = " + str.substring(str.length()- 2));
            System.out.println("The other characters are = " + str.substring(2,str.length()- 2));
        }

        System.out.println("\n-------Task-4-------");

        System.out.println("Given String");
        String s1 = input.nextLine();

        if (s1.length() < 2){
            System.out.println("Length is less than 2");
        }else if(s1.substring(0,2).equals(s1.substring(s1.length()-2))){
            System.out.println("true");

        }else System.out.println("false");


        System.out.println("\n-------Task-5-------");

        System.out.println("Given String");
        String str1 = input.nextLine();
        System.out.println("Given String");
        String str2 = input.nextLine();


        if (str1.length() < 2 || str2.length() < 2){
            System.out.println("INVALID INPUT");
        }else{
            System.out.println(str1.substring(1, str1.length()-1) + str2.substring(1, str2.length()-1));
        }


        System.out.println("\n-------Task-6-------");

        System.out.println("Given String");
        String t6 = input.nextLine();

        if (t6.length() < 4){
            System.out.println("INVALID INPUT");
        }else if (t6.startsWith("xx") && t6.endsWith("xx")){
            System.out.println("true");
        }else System.out.println("false");













    }
}
