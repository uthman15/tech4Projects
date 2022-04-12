package operator.arithmeticOperators;

public class Exercise2 {
    public static void main(String[] args) {

        /*
        create the variables
        Find the area with multiplying
        Find the perimeter with formula
        Print them
         */

        int a = 4;
        int b = 6;

        int area = a * b;
        // a = a * b; // a=4, b =6
        int perimeter = 2* (a + b);

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


        System.out.println("area = " + (a * b));
        System.out.println("perimeter = " + ((a + b) * 2));


    }
}
