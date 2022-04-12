package homeworks;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        // Task-1
        String s1 = "5", s2 = "10";
        int s1Int = Integer.parseInt(s1), s2int = Integer.parseInt(s2);
        System.out.println("-Sum of 5 and 10 is = " + (s1Int + s2int) + "\n" +
                "-Product of 5 and 10 is = " + (s1Int * s2int) + "\n" +
                "-Division of 5 and 10 is = " + (s1Int / s2int) + "\n" +
                "-Subtraction of 5 and 10 is = " + (s1Int - s2int) + "\n" +
                "-Remainder of 5 and 10 is = " + (s1Int % s2int));

        // Task-2
        String a1 = "200", a2 = "-50";
        int a1Int = Integer.parseInt(a1), a2int = Integer.parseInt(a2);
        System.out.println("The greatest value is = " + a1Int + "\nThe smallest value is = " + a2int +
                "\nThe average is = " + (a1Int + a2int) / 2 + "\nThe absolute difference is = " + Math.abs(a1Int - a2int));

        // Task-3
        double save1 = (0.75 + 0.10 + 0.10 + 0.01);
        System.out.println((int)(24 / save1) + " days\n" +
        ((int)(168 / save1)) + " days\n$" + (150 * save1));

        // Task-4
        double buy1 = (1250 / 62.5);
        System.out.println((int)(buy1));

        // Task-5
        double mP1 = (14265 / 475.50), mP2 = (14265 / 951);
        System.out.println("Option 1 will take " + ((int) mP1) + " months\nOption 2 will take " + ((int) mP2) +" months");

        // Task-6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();

        System.out.println((double)number1 / number2);



    }


}
