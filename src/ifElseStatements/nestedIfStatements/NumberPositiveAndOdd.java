package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {
        /*
Write a program that generates a random number bt -50 and 50
And check if number is positive first
If number is positive, print "Number is positive"
then also check if number is odd and print "Number is positive and odd"

NOTE: if number is not positive, then you don't need to check if it is odd

PSEUDO
1.Generate a random number bt -50 and 50
2.Check if it is positive, and print message
3.If positive, also check if it is odd and print message
 */

        int n = (int) (Math.random() * 101) - 50;
        System.out.println(n);

        if (n > 0) { // checking the number is POSITIVE only

            // is the number positive here YES so check it again inside of HERE

            if (n % 2 != 0) { // checking if the number is ODD or not
                System.out.println("Number is positive and odd");
            } else { // checking the number is NEGATIVE ONLY
                System.out.println("NUmber is positive and even");

                int n1 = (int)(Math.random() * 101) -50;
                System.out.println(n);

                // Positive
                if (n > 0) {
                    //Positive
                }else if (n < 0) {
                        // Negative
                        System.out.println("Negative");
                    }else{
                        //zero
                        System.out.println("zero");
                    }
                }}}
}