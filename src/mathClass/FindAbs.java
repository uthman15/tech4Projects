package mathClass;

public class FindAbs {
    public static void main(String[] args) {

        char c = (char)Math.abs(6-10);
        char b = 45;

        int abs = Math.abs(6-10 + 4 + 1 + 65 - 34);
        // int abs = Math.abs(32); same thing

        // int abs2 = Math.abs(5,7); not gonna work

        System.out.println(abs);


        int x = 53;
        int y = 34;

        System.out.println(Math.abs(y - x));

        // 2, 3, 4, 5, 6, 7, 8, 9, 10

        int givenNumber = 7;
        System.out.println(Math.abs(6 - givenNumber) <= 4);

    }
}
