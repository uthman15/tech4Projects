package homeworks;

import utilities.MathHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("\n------Task-1------\n");
        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));


        System.out.println("\n------Task-2------\n");
        String[] element2 = new String[5];
        element2[1] = "abc";
        element2[4] = "xyz";
        System.out.println(element2[3]);
        System.out.println(element2[0]);
        System.out.println(element2[4]);
        System.out.println(Arrays.toString(element2));


        System.out.println("\n------Task-3------\n");
        int[] numbers3 = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers3));
        Arrays.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));


        System.out.println("\n------Task-4------\n");
        String[] countries = {"Germany","Argentina","Ukraine","Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n------Task-5------\n");
        String[] dogs = {"Scooby Doo","Snoopy","Blue","Pluto","Dino","Sparky"};
        System.out.println(Arrays.toString(dogs));
        boolean hasPluto = false;
        for (String dog : dogs) {
            if (dog.equals("Pluto")) {
                hasPluto = true;
                break;
            }
        }
        System.out.println(hasPluto);


        System.out.println("\n------Task-6------\n");
        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        boolean hasGarfield_Felix = false;
        for (int i = 0; i < cats.length ;i++) {
            if (cats[i].equals("Garfield") && cats[i].equals("Felix")) {
                hasGarfield_Felix = true;
                break;
            }
        }
        System.out.println(hasGarfield_Felix);


        System.out.println("\n------Task-7------\n");
        double [] number = {10.5, 20.75, 70.0, 80.0, 15.75};
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }


        System.out.println("\n------Task-8------\n");

        char [] char8 = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        System.out.println(Arrays.toString(char8));
        int letters = 0;
        int lower = 0;
        int upper = 0;
        int digits = 0;
        int special = 0;
        for (int i = 0; i < char8.length; i++) {
            if (Character.isLetter(char8[i])) {
                letters++;
                if (Character.isUpperCase(char8[i])) upper++;
                else lower++;
            }
            else if (Character.isDigit(char8[i])) digits++;
            else special++;
        }
        System.out.println("Letters = " + letters);
        System.out.println("Uppercase letters = " + upper);
        System.out.println("Lowercase letters = " + lower);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);


        System.out.println("\n------Task-9------\n");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(objects));
        int upperCase = 0;
        int lowerCase = 0;
        int bpCount = 0;
        int bookPenCount = 0;
        for (int i = 0; i < objects.length; i++) {
            if(objects[i].charAt(0) >= 65 && objects[i].charAt(0) <= 90) {
                upperCase++;
                if (objects[i].charAt(0) == 66 || objects[i].charAt(0) == 80) bpCount++;
            }
            else if (objects[i].charAt(0) >= 97 && objects[i].charAt(0) <= 122) {
                lowerCase++;
                 if (objects[i].charAt(0) == 98 || objects[i].charAt(0) == 112) bpCount++;
            }
            if (objects[i].toUpperCase().contains("BOOK") || objects[i].toUpperCase().contains("PEN")) bookPenCount++;
        }
        System.out.println("Elements starts with uppercase = " + upperCase);
        System.out.println("Elements starts with lowercase = " + lowerCase);
        System.out.println("Elements starting with B or P = " + bpCount);
        System.out.println("Elements having \"book\" or \"pen\" = " + bookPenCount);


        System.out.println("\n------Task-10------\n");
        int [] num10 = {3,5,7,10,0,20,17,10,23,56,78};
        System.out.println(Arrays.toString(num10));
        int moreThan10 = 0;
        int lessThan10 = 0;
        int are10 = 0;
        for (int i = 0; i < num10.length; i++) {
            if (num10[i] > 10) moreThan10++;
            else if (num10[i] < 10) lessThan10++;
            else are10++;
        }
        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + are10);


        System.out.println("\n------Task-11------\n");

        int[] first = {5,8,13,1,2};
        int[] second = {9,3,67,1,0};
        int[] third = new int[5];
        int max = 0;
        System.out.println("1st array is = " + Arrays.toString(first));
        System.out.println("2nd array is = " + Arrays.toString(second));
        for (int i = 0; i < first.length; i++) {
            max = Math.max(first[i], second[i]);
            third[i] += max;
        }
        System.out.println("3rd array is = " + Arrays.toString(third));

    }
}
