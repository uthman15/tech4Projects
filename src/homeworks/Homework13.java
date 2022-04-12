package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("\n------Task-1------\n");
        int[] fooBarT1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : fooBarT1) {
            if (number % 2 == 0 && number % 5 == 0) System.out.println("Foobar");
            else if (number % 2 == 0) System.out.println("Foo");
            else if (number % 5 == 0) System.out.println("Bar");
            else System.out.println(number);
        }

        System.out.println("\n------Task-2------\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        boolean positiveNumber = false;
        boolean negativeNumber = false;
        int positiveCount = 0;
        int negativeCount = 0;
        for (int number : numbers) {
            if (number > 0 && positiveCount == 0){
                System.out.println("First positive number is: " + number);
                positiveNumber = true;
                positiveCount++;
            }else if(number < 0 && negativeCount == 0){
                System.out.println("First negative number is: " + number);
                negativeNumber = true;
                negativeCount++;
            }
            if (positiveNumber && negativeNumber) break;
        }

        System.out.println("\n------Task-3------\n");

        int randomNumber1 = (int)(Math.random() * 10 + 1);
        int randomNumber2 = (int)(Math.random() * 10 + 1);
        int randomNumber3 = (int)(Math.random() * 10 + 1);
        int randomNumber4 = (int)(Math.random() * 10 + 1);
        int randomNumber5 = (int)(Math.random() * 10 + 1);
        int[] numbersT3 = {randomNumber1, randomNumber2, randomNumber3, randomNumber4, randomNumber5};
        boolean contains = false;
        for (int number : numbersT3) {
            if (number == 2 || number == 3){
                contains = true;
                break;
            }
        }
        System.out.println(contains);


        System.out.println("\n------Task-4------\n");

        String[] list = {"banana”, “orange”, “Apple"};
        boolean fruit = false;
        for (String words : list) {
            if (words.equalsIgnoreCase("Apple")){
                fruit = true;
                break;
            }
        }
        System.out.println(fruit);


        System.out.println("\n------Task-5------\n");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean MatchingElements = false;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]){
                    System.out.println(numbers1[i]);
                    MatchingElements = true;
                }
            }
        }
        if (!MatchingElements)System.out.println("There is no matching elements");
        System.out.println("\n------Task-6------\n");
        String str = "baNana";
        char [] newStr = str.toLowerCase().toCharArray();
        boolean duplicateCharacters = false;
        String duplicated = "";
        for (int i = 0; i < newStr.length; i++) {
            for (int j = i + 1; j < newStr.length; j++) {
                if (!(duplicated.contains(newStr[i] + "")) && newStr[i] == (newStr[j])) {
                    duplicated += newStr[i];
                    duplicateCharacters = true;
                    System.out.println(newStr[i]);
                }
            }

        }
    }
}
