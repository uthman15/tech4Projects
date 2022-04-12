package arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A', ' ',',', '#', 'T', '6', '9'};
        System.out.println(chars.length); // 7

        /*
        Print each element with a message

        EXPECTED OUTPUT:
        Element = A
        Element =
        Element = ,
        Element = #
        Element = T
        Element = 6
        Element = 9
         */

        System.out.println("\n------fori loop-----\n");
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element = " + chars[i]);
        }

        System.out.println("\n------for each loop-----\n");
        for (char element: chars){
            System.out.println("Element = " + element);
        }

    }
}
