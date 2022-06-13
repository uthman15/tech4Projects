package homeworks;

public class Homework21 {

    //TASK-1
    public static void fizzBuzz1(int num){
        for (int i = 1; i <= num; i++){
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }

    //TASK-2
    public static String fizzBuzz2(int num){
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 5 == 0) return "Buzz";
        else if (num % 3 == 0) return "Fizz";
        else return String.valueOf(num);
    }

    //TASK-3
    public static int findSumNumbers(String str1){
        int sum = 0;
        boolean hasDigit = false;
        String str2 = str1.replaceAll("[^0-9]", " ");
        String[] arr = str2.split(" ");
        for (String s1 : arr) {
            if (s1.length() != 0) {
                sum += Integer.parseInt(s1);
                hasDigit = true;
            }
        }
        if (hasDigit)return sum;
        else return 0;

    }

    //TASK-4
    public static int findBiggestNumber(String str1){
        int biggestNUmber = Integer.MIN_VALUE;
        boolean hasDigit = false;
        String str2 = str1.replaceAll("[^0-9]", " ");
        String[] arr = str2.split(" ");
        for (String s1 : arr) {
            if (s1.length() != 0){
                if (Integer.parseInt(s1)> biggestNUmber) {
                    biggestNUmber = Integer.parseInt(s1);
                    hasDigit = true;
                }
            }
        }
        if (hasDigit)return biggestNUmber;
        else return 0;
    }

    //TASK - 5
    public static String countSequenceOfCharacters(String s){
        String str = "";
        int count = 1;
        if (s.length() == 0) return "";
        else{
            for (int i = 0; i < s.length() - 1; i++) {
                count = 1;
                if (("" + s.charAt(i)).equals("" + s.charAt(i + 1))){
                    count ++;
                    i = i + count - 1;
                }
                str += String.valueOf(count) + s.charAt(i);
            }
            if (!("" + s.charAt(s.length() - 1)).equals(("" + s.charAt(s.length() - 2)))) str += "1" + s.charAt(s.length() - 1);
        }
        return str;
    }




    public static void main(String[] args) {
        System.out.println("\n---TASK-1---\n");
        fizzBuzz1(3);
        fizzBuzz1(5);
        fizzBuzz1(18);

        System.out.println("\n---TASK-2---\n");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("\n---TASK-3---\n");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

        System.out.println("\n---TASK-4---\n");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("\n---TASK-5---\n");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));






    }
}
