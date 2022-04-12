package stringMethods;

public class _02_concat {
    public static void main(String[] args) {
        /*
        Method Task: It is used to combine multiple strings, and form a new one
        -It is non-static, and we can call it with an object created
        -It is a return type method, and it returns a new String that is the combination of the others
        -It takes a String as an argument

         */

        String s1 = "Tech";
        String s2 = "Global";

        String s3 = s1.concat(s2); // String s3 = s1 + s2; // TechGlobal

        System.out.println(s3.concat(" School")); // TechGlobal School

        System.out.println("Hello".concat("World!")); // Hello World!
        System.out.println("Hello".concat(" ").concat("World!")); // Hello World!
        System.out.println("Hello");

    }
}
