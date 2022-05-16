package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HomeworkR4 {
    // Task-1
    public static String noSpace(String str){
        String noSpaces = str.replaceAll(" ", "");
        return noSpaces;
    }

    // Task-2
    public static String replaceFirstLast(String str){
        if (str.length() < 2) return "";
        else return str.substring(str.length()-1) + str.substring(1,str.length()-1) + str.substring(0,1);
    }

    // Task-3
    public static boolean hasVowel(String str){
        if (str.toUpperCase().contains("A") || str.toUpperCase().contains("E") || str.toUpperCase().contains("I") ||
                str.toUpperCase().contains("O") || str.toUpperCase().contains("U")) return true;
        else return false;
    }

    // Task-4
    public static void checkAge(int yearOfBirth){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        if ((currentYear - yearOfBirth) > 100 || currentYear < yearOfBirth) System.out.println("AGE IS NOT VALID");
        else if ((currentYear - yearOfBirth) < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
    }

    // Task-5
    public static int averageOfEdges(int n1, int n2, int n3){
        int max = Math.max(Math.max(n1,n2),n3);
        int min = Math.min(Math.min(n1,n2),n3);
        return (max+min)/2;
    }

    //Task-6
    public static String noA(String[] arr){
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].toUpperCase().charAt(0) == 'A') newArr[i] = "###";
            else newArr[i] = arr[i];
        }
        return Arrays.toString(newArr);
    }

    //Task-7
    public static String no3or5(int[] numbers){
        int[] newArr = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if ((numbers[i] % 5 == 0) && (numbers[i] % 3 == 0)) newArr[i] = 101;
            else if ((numbers[i] % 5 == 0)) newArr[i] = 99;
            else if(numbers[i] % 3 == 0) newArr[i] = 100;
            else newArr [i] = numbers[i];
        }
        return Arrays.toString(newArr);
    }

    //Task-8
    public static int countPrimes(int[] numbers){
        int count = 0;
        for (int number : numbers){
            if (number == 2 || number == 3) count++;
            else if (number > 3){
                boolean isPrime = true;
                for (int i = 2; i <= number / 2; i++){
                    if (number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(noSpace("  Hello World  "));
        System.out.println(replaceFirstLast("Hello"));
        System.out.println(hasVowel(""));
        checkAge(2050);
        System.out.println(averageOfEdges(-3, 15, -3));
        String [] test = {"apple", "appium", "ABC", "Alex", "A"};
        System.out.println(noA(test));
        int [] test2 = {10,11,12,13,14,15};
        System.out.println(no3or5(test2));
        System.out.println(countPrimes(test2));
    }

}
