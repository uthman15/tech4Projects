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
        String[] newArr = new String[arr.length]; // need a place to store my new "###" element and the others that dont start with a
        for (int i = 0; i < arr.length; i++){ //we need a loop b/c we need to check every word
            if (arr[i].toUpperCase().charAt(0) == 'A') newArr[i] = "###"; // checking every word to see if it starts with a or A
            else newArr[i] = arr[i]; // if element doesnt start with a then add that original element to new array
        }
        return Arrays.toString(newArr); // need to do Arrays.toString() instead of just newArr because just newArr will return location
    }

    //Task-7
    public static String no3or5(int[] numbers){
        int[] newArr = new int[numbers.length]; // we need to add the new edited numbers into the array with the others that arent divisble by either 5 or 3
        for(int i = 0; i < numbers.length; i++){ // we need to check every element
            if ((numbers[i] % 5 == 0) && (numbers[i] % 3 == 0)) newArr[i] = 101; //checking if divisible by 3 and 5 first to make sure that is checked... if we start with 5 or 3 then it won't check if its divisible by both!!! and then adding into a new array as the replaced number
            else if ((numbers[i] % 5 == 0)) newArr[i] = 99;
            else if(numbers[i] % 3 == 0) newArr[i] = 100;
            else newArr [i] = numbers[i]; // adding original numbers into new array that arent divisble by either 5 or 3
        }
        return Arrays.toString(newArr); // need to do Arrays.toString() instead of just newArr because just newArr will return location
    }

    //Task-8
    public static int countPrimes(int[] numbers){
        int count = 0; // know we need to count so automatically make empty counting container
        for (int number : numbers){ // we need to check every number so make a loop
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
