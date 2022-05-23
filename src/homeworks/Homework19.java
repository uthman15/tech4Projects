package homeworks;

import java.util.Arrays;

public class Homework19 {

        // Task-1
        public static String noDigit(String str){
            String newStr = str.replaceAll("[0-9]", "");
            return newStr;
        }

        // Task-2
        public static String noVowel(String str){
            String newStr2 = str.replaceAll("[aeiouAEIOU]", "");
            return newStr2;
        }

        // Task-3
        public static int sumOfDigits(String str){
            int totalNum = 0;
                for (int i = 0; i <= str.length()-1; i++) {
                     if (Character.isDigit(str.charAt(i)))  {
                         totalNum += Integer.parseInt("" + str.charAt(i));
                     }
                }
                return totalNum;
        }

        // Task-4
        public static boolean hasUpperCase(String str){
            boolean isUppercase = false;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))){
                    isUppercase = true;
                    break;
                }
            }
            return isUppercase;
        }

        // Task-5
        public static int middleInt(int num, int num2, int num3){
            if (num == num2 || num2 == num3) return num2;
            else if (num == num3) return num;

            int max = Math.max(Math.max(num, num2), num3);
            int min = Math.min(Math.min(num, num2), num3);

            if (num != max && num != min) return num;
            else if (num2 != max && num2 != min) return num2;
            else return num3;
        }

        // Task-6
        public static int[]no13(int[] a){
            int[] newArr = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 13) newArr[i] = 0;
                else newArr[i] = a[i];
            }
            return newArr;
        }

        // Task-7
        public static int[] arrFactorial(int[] arr){
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0 || arr[i] == 1) newArr[i] = 1;
                else{
                    int factorial = arr[i];
                    for (int j = 2; j < factorial; j++) {
                        arr[i] *= i;
                    }
                    newArr[i] += arr[i];
                }
            }
            return newArr;
        }

        // Task-8
        public static String[] categorizeCharacters(String str){
            String[] newArr = new String[3];
            String letters = "";
            String num = "";
            String special = "";
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) letters += str.charAt(i);
                else if (Character.isDigit(str.charAt(i))) num += str.charAt(i);
                else special += str.charAt(i);
            }
            newArr[0] = letters;
            newArr[1] = num;
            newArr[2] = special;
            return newArr;
        }


    public static void main(String[] args) {
        System.out.println("\n-----Task-1-----\n");
        System.out.println(noDigit("123Hello"));
        System.out.println(noDigit("123 Hello World149"));
        System.out.println("\n-----Task-2-----\n");
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("TechGlobal"));
        System.out.println("\n-----Task-3-----\n");
        System.out.println(sumOfDigits("Java"));
        System.out.println(sumOfDigits("John's age is 29"));
        System.out.println("\n-----Task-4-----\n");
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase(""));
        System.out.println("\n-----Task-5-----\n");
        System.out.println(middleInt(1, 3, 5));
        System.out.println(middleInt(5,5, 8));
        System.out.println("\n-----Task-6-----\n");
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3})));
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3, 4})));
        System.out.println("\n-----Task-7-----\n");
        System.out.println(Arrays.toString(arrFactorial(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 2, 4, 1})));
        System.out.println("\n-----Task-8-----\n");
        System.out.println(Arrays.toString(categorizeCharacters(" ")));
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#$")));
        System.out.println(Arrays.toString(categorizeCharacters("12ab$%3c%")));
    }

}
