package projects;

import mathClass.ExerciseMathRandom;

public class Project03 {
    public static void main(String[] args) {

        // Task-1

        String s1 = "24", s2 = "5";

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println("The sum of " + n1 + " and " + n2 + " = " + (n1 + n2));
        System.out.println("The subtraction of " + n1 + " and " + n2 + " = " + (n1 - n2));
        System.out.println("The division of " + n1 + " and " + n2 + " = " + ((double) n1 / n2));
        System.out.println("The multiplication of " + n1 + " and " + n2 + " = " + (n1 * n2));
        System.out.println("The remainder of " + n1 + " and " + n2 + " = " + (n1 % n2));

        // Task-2

        int num1 = (int) (Math.random() * 35) + 1;

        if (num1 % 2 == 1) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }

        // Task-3

        int task3n1 = (int) (Math.random() * 50) + 1;
        int task3n2 = (int) (Math.random() * 50) + 1;
        int task3n3 = (int) (Math.random() * 50) + 1;

        System.out.println("Random number 1 = " + task3n1);
        System.out.println("Random number 2 = " + task3n2);
        System.out.println("Random number 3 = " + task3n3);

        int lowest = (int) (Math.min(Math.min(task3n1, task3n2), task3n3));
        int middle;
        int greatest = (int) (Math.max(Math.max(task3n1, task3n2), task3n3));

        System.out.println("Lowest number is = " + lowest);
        if (task3n1 != greatest && task3n1 != lowest) {
            middle = task3n1;
        } else if (task3n2 != greatest && task3n2 != lowest) {
            middle = task3n2;
        } else {
            middle = task3n3;

        }

        System.out.println("Middle number is = " + middle);
        System.out.println("Greatest number is = " + greatest);

        // Task-4

        char c = '5';
        if (c >= 65 && c <= 90) System.out.println("The letter is uppercase");
        else if (c >= 97 && c <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        char c2 = 'a';
        if (c2 >= 65 && c2 <= 90) System.out.println("The letter is uppercase");
        else if (c2 >= 97 && c2 <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");

        char c3 = 'R';
        if (c3 >= 65 && c3 <= 90) System.out.println("The letter is uppercase");
        else if (c3 >= 97 && c3 <= 122) System.out.println("The letter is lowercase");
        else System.out.println("Invalid character detected!!!");


        // Task-5

        char t5 = '#';
        if ((t5 >= 65 && t5 <= 90) || (t5 >= 97 && t5 <= 122)) {
            if (t5 == 'A' || t5 == 'E' || t5 == 'I' || t5 == 'O' || t5 == 'U' || t5 == 'a'
                    || t5 == 'e' || t5 == 'i' || t5 == 'o' || t5 == 'u') {
                System.out.println("The letter is vowel");
            } else {
                System.out.println("The letter is consonant");
            }

        } else {
            System.out.println("Invalid character detected!!!");
        }

        char t5_2 = 'E';
        if ((t5_2 >= 65 && t5_2 <= 90) || (t5_2 >= 97 && t5_2 <= 122)) {
            if (t5_2 == 'A' || t5_2 == 'E' || t5_2 == 'I' || t5_2 == 'O' || t5_2 == 'U' || t5_2 == 'a'
                    || t5_2 == 'e' || t5_2 == 'i' || t5_2 == 'o' || t5_2 == 'u') {
                System.out.println("The letter is vowel");
            } else {
                System.out.println("The letter is consonant");
            }

        } else {
            System.out.println("Invalid character detected!!!");
        }

        char t5_3 = 'R';
        if ((t5_3 >= 65 && t5_3 <= 90) || (t5_3 >= 97 && t5_3 <= 122)) {
            if (t5_3 == 'A' || t5_3 == 'E' || t5_3 == 'I' || t5_3 == 'O' || t5_3 == 'U' || t5_3 == 'a'
                    || t5_3 == 'e' || t5_3 == 'i' || t5_3 == 'o' || t5_3 == 'u') {
                System.out.println("The letter is vowel");
            } else {
                System.out.println("The letter is consonant");
            }

        } else {
            System.out.println("Invalid character detected!!!");
        }

        // Task-6

        char t6 = '8';
        if ((t6 >= 65 && t6 <= 90) || (t6 >= 97 && t6 <= 122) || (t6 >= 48 && t6 <= 57)) {
            System.out.println("Invalid character detected!!!");
        }else System.out.println("Special character is = " + String.valueOf(t6));

        char t6_2 = '*';
        if ((t6_2 >= 65 && t6_2 <= 90) || (t6_2 >= 97 && t6_2 <= 122) || (t6_2 >= 48 && t6_2 <= 57)) {
            System.out.println("Invalid character detected");
        }else System.out.println("Special character is = " + String.valueOf(t6_2));


        // Task-7

        char t7 = 'g';
        if ((t7 >= 65 && t7 <= 90) || (t7 >= 97 && t7 <= 122)) {
            System.out.println("Character is a letter");
        }else if (t7 >= 48 && t7 <= 57) {
            System.out.println("Character is a digit");
        }else System.out.println("Character is a special character");

        char t7_2 = '5';
        if ((t7_2 >= 65 && t7_2 <= 90) || (t7_2 >= 97 && t7_2 <= 122)) {
            System.out.println("Character is a letter");
        }else if (t7_2 >= 48 && t7_2 <= 57) {
            System.out.println("Character is a digit");
        }else System.out.println("Character is a special character");

        char t7_3 = '@';
        if ((t7_3 >= 65 && t7_3 <= 90) || (t7_3 >= 97 && t7_3 <= 122)) {
            System.out.println("Character is a letter");
        }else if (t7_3 >= 48 && t7_3 <= 57) {
            System.out.println("Character is a digit");
        }else System.out.println("Character is a special character");


    }
}
