package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("\n-----Task-1-----\n");
        // int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        // int[] numbers = {-8, 56, 7, 8, 65};
        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        int count = 0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] == numbers[j]) && count == 0) {
                    count++;
                    System.out.println(numbers[i]);
                }
            }
        }
        if (count == 0){
            System.out.println("There is no duplicates");
        }

        System.out.println("\n-----Task-2-----\n");
        String[] words = {"Z", "abc", "z", "123", "#" };
        int count2 = 0;
        for (int i = 0; i < words.length ; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((words[i].equalsIgnoreCase(words[j])) && count2 == 0) {
                    count2++;
                    System.out.println(words[i]);
                }
            }
        }
        if (count2 == 0){
            System.out.println("There is no duplicates");
        }

        System.out.println("\n-----Task-3-----\n");
        //int[] numbers3 = {1, 2, 5, 0, 7};
        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        List<Integer> duplicatedNumbers = new ArrayList<>();

        for (int i = 0; i < numbers3.length; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (!duplicatedNumbers.contains(numbers3[i]) && numbers3[i] == numbers3[j]) duplicatedNumbers.add(numbers3[i]);
            }
        }
        if (duplicatedNumbers.size() == 0) System.out.println("There is no duplicates");
        else {
            for (int i = 0; i < duplicatedNumbers.size(); i++) {
                System.out.println(duplicatedNumbers.get(i));
            }
        }


        System.out.println("\n-----Task-4-----\n");

        // String[] words4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        String[] words4 = {"python", "foo", "bar", "java", "123" };

        List<String> duplicatedWords = new ArrayList<>();

        for (int i = 0; i < words4.length; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if(words4[i].equalsIgnoreCase(words4[j]) && !duplicatedWords.contains(words4[i].toUpperCase())){
                    duplicatedWords.add(words4[i]);
                }
            }
        }
        if (duplicatedWords.size() == 0){
                System.out.println("There is no duplicates");
        }
        else for (int i = 0; i < duplicatedWords.size(); i++) {
            System.out.println(duplicatedWords.get(i));
        }


        System.out.println("\n-----Task-5-----\n");

       // String[] words5 = {"abc", "foo", "bar"};
        String[] words5 = {"java", "python", "ruby"};

        List<String> wordsReverse = new ArrayList<>();
        for (int i = words5.length-1; i >= 0; i--) {
            wordsReverse.add(words5[i]);
        }
        System.out.println(wordsReverse);


        System.out.println("\n-----Task-6-----\n");
        String str = "Java is fun";
        String[] strArr = str.split(" ");
        String reversedWords = "";

        for (String s : strArr) {
            for (int i = s.length()-1; i >= 0 ; i--) {
                reversedWords += s.charAt(i);
            }
            reversedWords += " ";
        }
        System.out.println(reversedWords);
    }
}
