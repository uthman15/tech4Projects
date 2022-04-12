package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {
        /*
        Write a program to find sum of the numbers from 10 to 15 (10 and 15 are included)
        10+11+12+13+14+15


        Expected output:
        75
         */

        // 1. create a result container eventually will have your answer
        int sum = 0;

        //2. start filling your result
        for (int i = 10; i <= 15; i++){
            sum += i;
        }
        //3. Print your result
        System.out.println(sum);
    }
}
