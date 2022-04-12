package ifElseStatements;

public class FindTheGreatestOf2Numbers {
    public static void main(String[] args) {

        /*
        How to get random number 0 to 10 (both included)
        Math.random() returns numbers netween 0.0 and 1.0 (0.0 is included but not 1.0)
        0 1 2 3 4 5 6 7 8 9 10

        between 23 to 37 -> big - small + 1
         */
        int num1 = (int) Math.random() * 11, num2 = (int)(Math.random() * 11) ;

        System.out.println(num1);
        System.out.println(num2);

        //Math.max()

        System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + Math.max(num1, num2));

        if (num1 > num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num1);
        }
        else{ // num1 == num2 || num > num1
            System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + num2);
        }
    }


}
