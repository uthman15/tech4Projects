package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+", "hello")); // true --> contains one or more letters
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "hello class"));
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}", "UthmanMusleh-_1"));

        /*
        Write a regex pattern for a phone number with the format of: (XXX)-XXX-XXXX
         */

        System.out.println(Pattern.matches("\\([1-9]{3}\\)-[\\d]{3}-[\\d]{4}", "(123)-456-7890"));

    }
}
